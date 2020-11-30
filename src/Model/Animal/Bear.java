package Model.Animal;

import java.util.Date;

public class Bear extends Mammal {
    public boolean isVagabonding;
    public String sound;

    public Bear(int weight, int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health, boolean isVagabonding, String sound) {
        super("Bear", weight, height, dateOfBirth, hunger, sleeping, gender, health);
        this.isVagabonding = isVagabonding;
        this.sound = "Bear sound";
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
}
