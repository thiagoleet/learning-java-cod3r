package modelo.umpraum;

import javax.persistence.*;

@Entity
@Table(name = "assentos")
public class Assento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private  String nome;

    public Assento() {}

    public Assento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
