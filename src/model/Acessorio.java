package model;

public class Acessorio extends Produto {

    private String catAcessorio;

    public String getCatAcessorio() {
        return catAcessorio;
    }

    public void setCatAcessorio(String catAcessorio) {
        this.catAcessorio = catAcessorio;
    }

    @Override
    public String toString() {
        return "model.Acessorio{" +
                "Categoria do acessório: " + catAcessorio +
                "\nnome: " + nome +
                "\npreco: " + preco;
    }
}
