package service;

import model.Racao;

import java.util.ArrayList;
import java.util.Map;

public class RacaoService {
    ArrayList<Racao> racoes = new ArrayList<>();
    private int r;

    public void adicionar(Racao r){
        racoes.add(r);
    }

    public ArrayList<Racao> getRacoes() {
        return racoes;
    }

    public void remover(Object o) {
        racoes.remove(o);
    }
}
