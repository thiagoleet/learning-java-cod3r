package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class UsandoMaps {
    public static void main(String[] args) {
        Consumer<String> imprime = System.out::println;

        List<String> marcas = Arrays.asList("BMW", "Audi", "Honda");

        marcas.stream().map(m-> m.toUpperCase())
                .forEach(imprime);

        // Usando composição
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(imprime);


    }
}
