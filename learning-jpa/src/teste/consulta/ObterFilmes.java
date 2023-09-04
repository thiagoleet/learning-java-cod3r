package teste.consulta;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

import java.util.List;

public class ObterFilmes {
    public static void main(String[] args) {
        DAO<Filme> dao = new DAO<Filme>();
        List<Filme> filmes = dao.consultar("obterFilmesComNotaMaiorQue", "nota", 8.5);

        for (Filme filme : filmes) {
            System.out.println(new StringBuilder()
                    .append(filme.getTitulo())
                    .append(" | ")
                    .append(filme.getNota()
                            .toString())
            );

            System.out.println("Elenco:");

            for(Ator ator: filme.getAtores()) {
                System.out.println(ator.getNome());
            }

            System.out.println();
        }
    }
}
