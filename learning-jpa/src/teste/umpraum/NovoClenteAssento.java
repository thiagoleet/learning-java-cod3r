package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClenteAssento {
    public static void main(String[] args) {
        Assento assento = new Assento("8C");
        Cliente cliente = new Cliente("Carlos", assento);

        DAO<Object> dao = new DAO<>();

        dao.abrirTransacao()
                .incluir(assento)
                .incluir(cliente)
                .fecharTransacao()
                .fechar();
    }
}
