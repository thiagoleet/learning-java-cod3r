package teste.umpramuitos;

import infra.DAO;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class ObterPedido {
    public static void main(String[] args) {
        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(2L);

        for (ItemPedido item : pedido.getItens()) {
            System.out.println(new StringBuilder()
                    .append(item.getProduto())
                    .append(" | Quantidade: ")
                    .append(item.getQuantidade())
                    .toString());
        }

        dao.fechar();
    }
}
