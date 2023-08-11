package lambdas;

public class Produto {
    public Produto(String nome, double preco, double desconto) {
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    final String nome;
    final double preco;
    final double desconto;
}
