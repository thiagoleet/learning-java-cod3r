package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {
    public static void main(String[] args) {
        Filme filmeA = new Filme("Star Wars Ep 4", 10.0);
        Filme filmeB = new Filme("O Fugitivo", 7.8);

        Ator atorA = new Ator("Harisson Ford");
        Ator atorB = new Ator("Carrie Fisher");

        filmeA.adicionarAtor(atorA);
        filmeA.adicionarAtor(atorB);

        filmeB.adicionarAtor(atorA);

        DAO<Filme> dao = new DAO<Filme>();

        dao.incluirAtomico(filmeA);
    }
}
