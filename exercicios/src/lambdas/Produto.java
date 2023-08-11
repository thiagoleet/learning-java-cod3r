package lambdas;

import java.util.function.Function;

public class Produto {
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public final String nome;
    public final double preco;
    public final double desconto;

    @Override
    public String toString() {
        return "Nome: " + nome + " (R$ " + precoFinal.apply(this) + ")";
    }

//    public double getPrecoFinal() {
//        return preco * (1 - desconto);
//    }

    Function<Produto, Double> precoFinal = p -> p.preco * (1 - p.desconto);
}
