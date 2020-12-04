package Model.Enclos;

import Model.Animal.Animal;

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
    public boolean cleanEnclosure() {
        if(this.status == Status.BAD)
        {
            System.out.println("you can clean the enclosure");
            this.status = Status.GOOD;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "AvarianEnclosure{" +
                 super.toString() +
                "preferredHeight=" + preferredHeight +
                ", currentHeight=" + currentHeight +
                '}';
    }
}
