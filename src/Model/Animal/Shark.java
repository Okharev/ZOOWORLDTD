package Model.Animal;

import java.util.Date;

public class Shark extends Aquatic{
    public boolean isSwimmming;
    public String sound;


    public Shark(String name, int weight, int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health, boolean isSwimmming) {
        super("shark", name, weight, height, dateOfBirth, hunger, sleeping, gender, health);
        this.isSwimmming = isSwimmming;
        this.sound = "UeuUeuUeuUeuUeuH";
    }

    @Override
    public String makeSound(String sound) {
        return super.makeSound(this.sound);
    }

    public boolean isSwimmming() {
        return isSwimmming;
    }

    public void setSwimmming(boolean swimming) { this.isSwimmming = swimming;}

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
        System.out.println("Animal isVagabonding : " + this.isSwimmming);
    }
}
