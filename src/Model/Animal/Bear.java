package Model.Animal;

import java.util.Date;

public class Bear extends Mammal {
    public boolean isVagabonding;
    public String sound;

    public Bear(String name, int weight, int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health, boolean isVagabonding) {
        super(name, "Bear", weight, height, dateOfBirth, hunger, sleeping, gender, health);
        this.isVagabonding = isVagabonding;
        this.sound = "groua";
    }


    @Override
    public String makeSound(String sound) {
        return super.makeSound(sound);
    }

    public boolean isVagabonding() {
        return isVagabonding;
    }

    public void setVagabonding(boolean vagabonding) {
        isVagabonding = vagabonding;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void examineAnimal() {
        super.examineAnimal();
        System.out.println("Animal sound : " + this.sound);
        String vagabonding = (this.isVagabonding) ? "Currently vagabonding" : "Not Vagabonding";
        System.out.println("Animal vagabond : " + vagabonding);
    }
}
