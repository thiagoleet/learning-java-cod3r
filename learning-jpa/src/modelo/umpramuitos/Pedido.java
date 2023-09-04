package modelo.umpramuitos;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_pedidos")
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = true)
    private Date data;

    public Pedido() {
        this.data = new Date();
    }

    public Pedido(Date data) {
        this.data = data;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
