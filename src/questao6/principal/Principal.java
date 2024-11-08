package questao6.principal;

import questao6.model.Animal;
import questao6.model.Cachorro;
import questao6.model.Gato;
import questao6.model.Vaca;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        List<Animal> animalList = new ArrayList<>();

        animalList.add(new Cachorro("black",7));
        animalList.add(new Cachorro("melissa",3));
        animalList.add(new Gato("laranjinha",2));
        animalList.add(new Gato("meow",4));
        animalList.add(new Vaca("doroteia",2));

        animalList.forEach(Animal::emitirSom);
    }
}
