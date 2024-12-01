package model;

public class Animal extends Produto {

    private String raca;
    private double idade;
    private boolean vacinado;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    @Override
    public String toString() {
        return "model.Animal{" +
                "raca: " + raca + '\'' +
                ", idade: " + idade +
                ", vacinado: " + vacinado +
                ", nome: " + nome + '\'' +
                ", preco: " + preco +
                '}';
    }
}