package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código da pessoa");
        int codigo = entrada.nextInt();

        String select = "SELECT * FROM pessoas WHERE codigo = ?";
        String update = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement statement = conexao.prepareStatement(select);
        statement.setInt(1, codigo);

        ResultSet resultado = statement.executeQuery();
        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt("codigo"), resultado.getString("nome"));


            System.out.println("O nome atual é: " + p.getNome());
            entrada.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            statement.close();
            statement = conexao.prepareStatement(update);
            statement.setString(1, novoNome);
            statement.setInt(2, codigo);
            statement.execute();

            System.out.println("Pessoa alterada com sucesso!");

            statement.close();
        }


        conexao.close();
        entrada.close();

    }
}
