package oo.polimorfismo;

public class Jantar {
    public static void main(String[] args) {
        Pessoa convidado = new Pessoa(99.65);

        Arroz arroz = new Arroz(0.2);
        Feijao feijao = new Feijao(0.1);
        Sorvete sobremesa = new Sorvete(0.1);

        System.out.println(convidado);

        convidado.comer(arroz);
        convidado.comer(feijao);
        System.out.println(convidado);

        convidado.comer(sobremesa);
        System.out.println(convidado);
    }
}
