package model;

public class Produto {

    String nome;
    double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "model.Produto{" +
                "nome: " + nome +
                ", preco: " + preco;
    }
}
