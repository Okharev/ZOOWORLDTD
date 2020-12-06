package Model.Enclos;

import Model.Animal.Animal;
import Model.Animal.Avian;

import java.util.ArrayList;

public class AvarianEnclosure extends Enclosure {

    private float preferredHeight;
    private float currentHeight;

    public AvarianEnclosure(String name, int surfaceArea, int nbMaxAnimals, ArrayList<Animal> animals, Status status, float preferredHeight, float currentHeight) {
        super(name, surfaceArea, nbMaxAnimals, animals, status);

        float height = Math.abs(Math.abs(preferredHeight) - Math.abs(currentHeight));

        if( height >= 20 && status != Status.BAD )
            super.setStatus(DefaultEnclosure.Status.BAD);
        else if( height >= 10 && status != Status.CORRECT && status != Status.BAD )
            super.setStatus(DefaultEnclosure.Status.CORRECT);

        this.preferredHeight = preferredHeight;
        this.currentHeight = currentHeight;
    }


    public float getPreferredHeight() {
        return preferredHeight;
    }

    public void setPreferredHeight(float preferredHeight) {
        this.preferredHeight = preferredHeight;
    }

    public float getCurrentHeight() {
        return currentHeight;
    }

    public void setCurrentHeight(float currentHeight) {
        this.currentHeight = currentHeight;
    }

    @Override
    public void examineEnclosure() {
        super.examineEnclosure();
        System.out.println("==============CHARACTERISTICS Aviary=============");
        System.out.println("Enclosure prefferedDepth : " + this.preferredHeight);
        System.out.println("Enclosure currentDepth : " + this.currentHeight);
    }

    public  void addAnimal(Animal animal)
    {
        if(this.getAnimals().size() < this.getNbMaxAnimals() &&  animal instanceof Avian)
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
            setCurrentHeight(getPreferredHeight());

            System.out.println("Height is now : " + getCurrentHeight());

            this.status = Status.GOOD;
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
        setCurrentHeight(getCurrentHeight() - 1);

        float height = Math.abs(Math.abs(preferredHeight) - Math.abs(currentHeight));

        if( height >= 20 && status != Status.BAD )
            super.setStatus(DefaultEnclosure.Status.BAD);
        else if( height >= 10 && status != Status.CORRECT && status != Status.BAD )
            super.setStatus(DefaultEnclosure.Status.CORRECT);
    }
}
