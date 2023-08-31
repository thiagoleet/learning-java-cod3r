package jdbc.dao;

import jdbc.FabricaConexao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO {

    private Connection connection;

    public int incluir(String sql, Object... atributos) {
        try {
            PreparedStatement statement = getConnection()
                    .prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            // Setando os atributos
            adicionarAtributos(statement, atributos);

            if (statement.executeUpdate() > 0) {
                ResultSet resultSet = statement.getResultSet();

                if (resultSet.next()) {
                    return resultSet.getInt(1);
                }
            }

            return -1;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private void adicionarAtributos(PreparedStatement preparedStatement, Object[] atributos) throws SQLException {
        int indice = 1;
        for (Object atributo : atributos) {
            if (atributo instanceof String) {
                preparedStatement.setString(indice, (String) atributo);
            } else if (atributo instanceof Integer) {
                preparedStatement.setInt(indice, (Integer) atributo);
            }

            indice++;
        }
    }

    private Connection getConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                return connection;
            }
        } catch (SQLException e) {

        }

        connection = FabricaConexao.getConexao();
        return connection;
    }
}
