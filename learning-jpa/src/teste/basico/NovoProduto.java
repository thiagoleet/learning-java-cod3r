package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
    public static void main(String[] args) {
        DAO<Produto> dao = new DAO<>(Produto.class);

        Produto p = new Produto("Monitor 4k 32 pol", 2.999);

        dao.incluirAtomico(p).fechar();

        System.out.println(p);

    }
}
