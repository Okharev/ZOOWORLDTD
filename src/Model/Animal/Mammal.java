package Model.Animal;

import java.util.ArrayList;
import java.util.Date;

public abstract class Mammal extends Animal {
    private boolean canHaveOffspring;

    public Mammal(String specie, int weight, int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health) {
        super(specie, weight, height, dateOfBirth, hunger, sleeping, gender, health);

        if(gender == Gender.FEMALE)
        {
            this.canHaveOffspring = true;
        }
    }

    public boolean isCanHaveOffspring() {
        return canHaveOffspring;
    }

    public void setCanHaveOffspring(boolean canHaveOffspring) {
        this.canHaveOffspring = canHaveOffspring;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "canHaveOffspring=" + canHaveOffspring + '\n' +
                super.toString() +
                '}';
    }
}
