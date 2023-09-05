package jdbc.dao;



public class DAOTeste {
    public static void main(String[] args) {
        DAO dao = new DAO();

        String sql = "INSERT INTO PESSOAS (nome) VALUES (?)";

        dao.incluir(sql, "João Silva");
        dao.incluir(sql, "John Doe");
        dao.incluir(sql, "José das Couve");

        dao.close();

    }
}
