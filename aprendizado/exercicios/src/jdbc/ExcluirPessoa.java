package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluirPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código da pessoa");
        int codigo = entrada.nextInt();

        String select = "SELECT * FROM pessoas WHERE codigo = ?";
        String delete = "DELETE FROM pessoas WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement statement = conexao.prepareStatement(select);
        statement.setInt(1, codigo);

        ResultSet resultado = statement.executeQuery();
        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));

            statement.close();
            statement = conexao.prepareStatement(delete);
            statement.setInt(1, codigo);


            if(statement.executeUpdate() > 0) {
                System.out.println("Pessoa " + p.getNome() + " excluída com sucesso!");
            } else {
                System.out.println("Falha ao excluir pessoa");
            }



            statement.close();
        } else {
            System.out.println("Pessoa não encontrada");
        }


        conexao.close();
        entrada.close();

    }
}
