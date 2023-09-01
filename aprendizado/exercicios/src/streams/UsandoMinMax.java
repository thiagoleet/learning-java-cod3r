package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UsandoMinMax {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luana", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return -1;
            return 0;
        };

        Comparator<Aluno> piorNota = (aluno1, aluno2) -> {
            if(aluno1.nota > aluno2.nota) return -1;
            if(aluno1.nota < aluno2.nota) return 1;
            if(aluno1.nota < aluno2.nota) return 1;
            return 0;
        };

        Aluno melhorAluno1 = alunos.stream()
                .max(melhorNota)
                .get();

        Aluno piorAluno1 = alunos.stream()
                .min(melhorNota)
                .get();

        Aluno melhorAluno2 = alunos.stream()
                .min(piorNota)
                .get();

        Aluno piorAluno2 = alunos.stream()
                .max(piorNota)
                .get();

        System.out.println(melhorAluno1);
        System.out.println(piorAluno1);
        System.out.println(melhorAluno2);
        System.out.println(piorAluno2);


    }
}
