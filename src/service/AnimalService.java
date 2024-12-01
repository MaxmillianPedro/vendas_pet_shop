package service;

import model.Animal;

import java.util.ArrayList;
import java.util.Map;

public class AnimalService {

    ArrayList<Animal> animais = new ArrayList<>();
    private int a;

    public void adicionar(Animal a){
        animais.add(a);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

    public void remover(Object o) {
        animais.remove(o);
    }
}
