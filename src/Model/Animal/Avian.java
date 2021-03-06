package Model.Animal;

import java.util.Date;

public abstract class Avian extends Animal {
    private boolean canHaveOffspring;

    public Avian(String specie, String name, int weight, int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health) {
        super(specie, name, weight, height, dateOfBirth, hunger, sleeping, gender, health);

        if (gender == Gender.FEMALE) {
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
    public void examineAnimal() {
        super.examineAnimal();

        String canHaveOffspring = (this.canHaveOffspring) ? "Can give birth" : "Can not give birth";
        System.out.println("Animal offspring : " + canHaveOffspring);
    }
}
