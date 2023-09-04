package modelo.umpraum;

import javax.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String nome;

    @OneToOne(mappedBy = "assento")
    private Cliente cliente;

    public Assento() {}

    public Assento(String nome) {
        this.nome = nome;
    }

    public Assento(String nome, Cliente cliente) {
        this.nome = nome;
        this.cliente = cliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
