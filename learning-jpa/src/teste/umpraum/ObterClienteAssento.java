package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class ObterClienteAssento {
    public static void main(String[] args) {
        DAO<Cliente> daoCliente = new DAO<>(Cliente.class);
        DAO<Assento> daoAssento = new DAO<>(Assento.class);

        Cliente cliente = daoCliente.obterPorID(1L);
        System.out.println(new StringBuilder()
                .append(cliente.getNome())
                .append(" | ")
                .append(cliente.getAssento().getNome())
                .toString());

        Assento assento = daoAssento.obterPorID(1L);
        System.out.println(new StringBuilder()
                .append(assento.getNome())
                .append(" | ")
                .append(assento.getCliente().getNome())
                .toString());

        daoCliente.fechar();
    }
}
