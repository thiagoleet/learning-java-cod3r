package teste.heranca;

import infra.DAO;
import modelo.heranca.Aluno;
import modelo.heranca.AlunoBolsista;

public class TesteHeranca {
    public static void main(String[] args) {
        DAO<Aluno> dao = new DAO<>();

        Aluno aluno = new Aluno(123L, "John");
        AlunoBolsista bolsista = new AlunoBolsista(345L, "Maria",1000.0 );

        dao.incluirAtomico(aluno);
        dao.incluirAtomico(bolsista);

        dao.fechar();

    }
}
