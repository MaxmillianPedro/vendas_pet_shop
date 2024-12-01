package model;

public class Racao extends Produto{

    double peso;
    String tipoAnimal;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    @Override
    public String toString() {
        return "model.Racao{" +
                "peso=" + peso +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                '}';
    }
}

