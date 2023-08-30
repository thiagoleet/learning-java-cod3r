package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) throws SQLException {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome da pessoa: ");

        String nome = entrada.nextLine();

        String sql = "INSERT INTO pessoas (nome) VALUES (?)";
        Connection connection = FabricaConexao.getConexao();
        PreparedStatement statement = connection.prepareStatement(sql);
        statement.setString(1, nome);
        statement.execute();

        System.out.println("Pessoa criada com sucesso!");
        connection.close();

        entrada.close();

    }
}
