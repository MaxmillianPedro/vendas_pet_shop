package service;

import model.Acessorio;

import java.util.ArrayList;
import java.util.Map;

public class AcessorioService {
    ArrayList<Acessorio> acessorios = new ArrayList<>();
    private int ac;

    public void adicionar(Acessorio ac) {
        acessorios.add(ac);
    }

    public ArrayList<Acessorio> getAcessorios() {
        return acessorios;
    }

    public void remover(Object o) {
        acessorios.remove(o);
    }
}