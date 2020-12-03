package Model.Enclos;

import Model.Animal.Animal;
import Model.Animal.Mammal;

import java.util.ArrayList;

public class DefaultEnclosure extends Enclosure {
    public DefaultEnclosure(String name, int surfaceArea, int nbMaxAnimals, ArrayList<Animal> mammals, Status status) {
        super(name, surfaceArea, nbMaxAnimals, mammals, status);

        if(mammals instanceof ArrayList<Mammal>)
        {
            System.out.printf("yey");
        }

    }
}
