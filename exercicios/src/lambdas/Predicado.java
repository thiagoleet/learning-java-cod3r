package lambdas;

import java.util.function.Predicate;

public class Predicado {
    public static void main(String[] args) {
        Predicate<Produto> isExpensive = prod -> prod.preco * (1 - prod.desconto) >= 750;
        Produto produto = new Produto("Notebook", 4000.00, 0.90);

        System.out.println(isExpensive.test(produto));
    }
}
