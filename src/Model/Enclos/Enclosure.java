package Model.Enclos;

import Model.Animal.Animal;

import java.util.ArrayList;

public abstract class Enclosure {
    private String name;
    private int surfaceArea;
    private int nbMaxAnimals;
    private int nbCurrAnimals;
    private ArrayList<Animal> animals;

    public String toString() {
        return "Enclosure{" +
                "name='" + name +  '\'' +
                ", surfaceArea=" + surfaceArea +
                ", nbMaxAnimals=" + nbMaxAnimals +
                ", nbCurrAnimals=" + nbCurrAnimals +
                ", animals=" + animals +
                ", status=" + status +
                '}';
    }

    public enum Status
    {
        GOOD,
        CORRECT,
        BAD
    } Enclosure.Status status;

    public Enclosure(String name, int surfaceArea, int nbMaxAnimals, ArrayList<Animal> animals, Status status) {
        this.name = name;
        this.surfaceArea = surfaceArea;
        this.nbMaxAnimals = nbMaxAnimals;
        this.nbCurrAnimals = animals.size();
        this.animals = animals;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public int getNbMaxAnimals() {
        return nbMaxAnimals;
    }

    public void setNbMaxAnimals(int nbMaxAnimals) {
        this.nbMaxAnimals = nbMaxAnimals;
    }

    public int getNbCurrAnimals() {
        return nbCurrAnimals;
    }

    public void setNbCurrAnimals(int nbCurrAnimals) {
        this.nbCurrAnimals = nbCurrAnimals;
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addAnimal(Animal animal)
    {
        if(this.animals.size() < this.nbMaxAnimals)
        {
            this.animals.add(animal);
            setNbCurrAnimals(getNbCurrAnimals() + 1);
        }
    }

    public void removeAnimal(int index)
    {
        this.animals.remove(index);
    }

    public ArrayList<Animal> getHungryAnimals()
    {
        ArrayList<Animal> hungryAnimals = new ArrayList<>();

        for (Animal animal : this.animals) {
            if(animal.isHunger())
            {
                hungryAnimals.add(animal);
            }
        }
        return hungryAnimals;
    }

    public void displayAnimals()
    {
        for (Animal animal : this.animals) {
            animal.toString();
        }
    }

    public void cleanEnclosure()
    {
        if(this.status == Status.BAD)
        {
            System.out.println("you can clean the enclosure");
            this.status = Status.GOOD;
        }
    }

    public void feedHungryAnimals()
    {
        ArrayList<Animal> animalsToFeed = getHungryAnimals();

        for (Animal animal : animalsToFeed) {
            animal.setHunger(false);
        }
    }

}
