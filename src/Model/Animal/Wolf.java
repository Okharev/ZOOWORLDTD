package Model.Animal;

import Model.Enclos.Enclosure;

import java.util.Date;

public class Wolf extends Mammal {

    public boolean isVagabonding;
    public String sound;

    public Wolf(String name, int weight, int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health, boolean isVagabonding) {
        super(name, "Wolf", weight, height, dateOfBirth, hunger, sleeping, gender, health);
        this.isVagabonding = isVagabonding;
        this.sound = "awwwoooo";
    }


    @Override
    public String makeSound(String sound) {
        return super.makeSound(this.sound);
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
    public String toString() {
        return "Wolf{" +
                "isVagabonding=" + isVagabonding +
                ", sound='" + sound + '\'' +
                super.toString() +
                '}';
    }
}
