package Model.Enclos;

import Model.Animal.Animal;

import java.util.ArrayList;

public class DefaultEnclosure extends Enclosure{

    public DefaultEnclosure(String name, int surfaceArea, int nbMaxAnimals, ArrayList<Animal> animals, Status status) {
        super(name, surfaceArea, nbMaxAnimals, animals, status);
    }
}
