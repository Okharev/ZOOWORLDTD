package Model.Enclos;

import Model.Animal.Animal;
import Model.Animal.Avian;
import Model.Animal.Mammal;

import java.util.ArrayList;

public class DefaultEnclosure extends Enclosure {
    public DefaultEnclosure(String name, int surfaceArea, int nbMaxAnimals, ArrayList<Animal> mammals, Status status) {
        super(name, surfaceArea, nbMaxAnimals, mammals, status);
    }

    public  void addAnimal(Animal animal)
    {
        if(this.getAnimals().size() < this.getNbMaxAnimals() &&  animal instanceof Mammal)
        {
            this.getAnimals().add(animal);
            setNbCurrAnimals();
        }
        else
        {
            System.out.println(animal.getSpecie() + " This animal does not belong here");
        }
    }
}
