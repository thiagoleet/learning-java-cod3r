package oo.encapsulamento;

public class Pessoa {
    private int idade;

    private String nome;

    public Pessoa(int idade, String nome) {
        this.setIdade(idade);
        this.setNome(nome);
    }

    // getter
    public int getIdade() {
        return idade;
    }

    // setter
    public void setIdade(int novaIdade) {
        novaIdade = Math.abs(novaIdade);
        if(novaIdade >= 0 && novaIdade <= 120) {
            this.idade = novaIdade;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Olá, eu sou " + this.getNome() + " e tenho " + this.getIdade() + " anos";
    }
}
