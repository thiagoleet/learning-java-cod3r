package oo.encapsulamento;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa(-30, "Pedro");
//        p1.idade = -30; // Alterar
        p1.setIdade(30);
        p1.setIdade(-45);

//        System.out.println(p1.idade); // Ler
        System.out.println(p1.getIdade()); // Ler

        System.out.println(p1);
    }
}
