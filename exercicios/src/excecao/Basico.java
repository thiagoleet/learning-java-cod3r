package excecao;

public class Basico {
    public static void main(String[] args) {

        Aluno a1 = null;

        // Null point exception
        try {
            imprimirNomeDoAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao imprimir o nome do usuário");
        }


        // ArithmeticException
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            // e.printStackTrace();
            System.out.println("Ocorreu o erro: " + e.getMessage());
        }

        System.out.println("Fim: ");
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
