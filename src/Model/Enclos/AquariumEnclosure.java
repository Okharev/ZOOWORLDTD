package Model.Enclos;

import Model.Animal.Animal;
import Model.Animal.Aquatic;

import java.util.ArrayList;

public class AquariumEnclosure extends Enclosure{

    private float prefferedDepth;
    private float currentDepth;
    private float prefferedSaltiness;
    private float currentSaltiness;

    public AquariumEnclosure(String name, int surfaceArea, int nbMaxAnimals, ArrayList<Animal> animals, Status status , float prefferedDepth, float currentDepth, float prefferedSaltiness, float currentSaltiness) {
        super(name, surfaceArea, nbMaxAnimals, animals, status);

        // Gets the abs diff between curr and desired depth and saltiness
        float depth = Math.abs(Math.abs(prefferedDepth) - Math.abs(currentDepth));
        float salt = Math.abs(Math.abs(prefferedSaltiness) - Math.abs(currentSaltiness));

        if( depth >= 20 || salt >= 20) {
            super.setStatus(DefaultEnclosure.Status.BAD);
        }
        else if( depth >= 10 || salt >= 10) {
            super.setStatus(DefaultEnclosure.Status.CORRECT);
        }
        else
            super.setStatus(DefaultEnclosure.Status.GOOD);

        this.prefferedDepth = prefferedDepth;
        this.currentDepth = currentDepth;
        this.prefferedSaltiness = prefferedSaltiness;
        this.currentSaltiness = currentSaltiness;
    }


    public float getPrefferedDepth() {
        return prefferedDepth;
    }

    public void setPrefferedDepth(float prefferedDepth) {
        this.prefferedDepth = prefferedDepth;
    }

    public float getCurrentDepth() {
        return currentDepth;
    }

    public void setCurrentDepth(float currentDepth) {
        this.currentDepth = currentDepth;
    }

    public float getPrefferedSaltiness() {
        return prefferedSaltiness;
    }

    public void setPrefferedSaltiness(float prefferedSaltiness) {
        this.prefferedSaltiness = prefferedSaltiness;
    }

    public float getCurrentSaltiness() {
        return currentSaltiness;
    }

    public void setCurrentSaltiness(float currentSaltiness) {
        this.currentSaltiness = currentSaltiness;
    }

    @Override
    public void examineEnclosure() {
        super.examineEnclosure();
        System.out.println("==============CHARACTERISTICS Aquarium=============");
        System.out.println("Enclosure prefferedDepth : " + this.prefferedDepth);
        System.out.println("Enclosure currentDepth : " + this.currentDepth);
        System.out.println("Enclosure prefferedSaltiness : " + this.prefferedSaltiness);
        System.out.println("Enclosure currentSaltiness: " + this.currentSaltiness);

    }

    public  void addAnimal(Animal animal)
    {
        if(this.getAnimals().size() < this.getNbMaxAnimals() &&  animal instanceof Aquatic)
        {
            this.getAnimals().add(animal);
            setNbCurrAnimals();
        }
        else
        {
            System.out.println(animal.getSpecie() + " This animal does not belong here");
        }
    }

    @Override
    public boolean cleanEnclosure()
    {
        if(this.status == Status.BAD && getAnimals().size() == 0)
        {
            System.out.println("you can clean the enclosure");
            setCurrentDepth(getPrefferedDepth());
            setCurrentSaltiness(getPrefferedSaltiness());

            System.out.println("Depth is now : " + getCurrentDepth());
            System.out.println("Saltiness is now : " + getCurrentSaltiness());

            super.setStatus(Status.GOOD);
            return true;
        }
        return false;
    }

    @Override
    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public void updateStatus()
    {
        setCurrentDepth(getCurrentDepth() - 1);
        setCurrentSaltiness(getCurrentSaltiness() + 1);

        float depth = Math.abs(Math.abs(prefferedDepth) - Math.abs(currentDepth));
        float salt = Math.abs(Math.abs(prefferedSaltiness) - Math.abs(currentSaltiness));

        if( depth >= 20 || salt >= 20) {
            super.setStatus(DefaultEnclosure.Status.BAD);
        }
        else if( depth >= 10 || salt >= 10) {
            super.setStatus(DefaultEnclosure.Status.CORRECT);
        }
        else
            super.setStatus(DefaultEnclosure.Status.GOOD);
    }

}
