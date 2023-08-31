package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        Connection connection = FabricaConexao.getConexao();

        System.out.println("Informe o nome da pessoa: ");
        String pesquisa = entrada.nextLine();

        String sql = "SELECT *   FROM pessoas WHERE nome LIKE ?";
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, "%" + pesquisa + "%");

        ResultSet resultado = statement.executeQuery();

        List<Pessoa> pessoas = new ArrayList<>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");

            pessoas.add(new Pessoa(codigo, nome));

        }

        for (Pessoa p : pessoas) {
            System.out.println(p.getCodigo() + " ===> " + p.getNome());
        }

        statement.close();
        connection.close();

    }
}
