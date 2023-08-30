package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        /*
        final String url = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true";
        final String usuario = "root";
        final String senha = "root";

        // gera uma exeção
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
         */

        Connection conexao = FabricaConexao.getConexao();

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}
