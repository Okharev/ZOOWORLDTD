package Model.Animal;

import java.util.Date;

public class Eagle extends Avian {
    public boolean isFlying;
    public String sound;


    public Eagle(String name, int weight, int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health, boolean isFlying) {
        super("Eagle", name, weight, height, dateOfBirth, hunger, sleeping, gender, health);

        this.isFlying = isFlying;
        this.sound = "IckIckIckIckIckIckIckIck";
    }

    @Override
    public String makeSound(String sound) {
        return super.makeSound(this.sound);
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }


    public boolean isFlying() {
        return isFlying;
    }

    public void setFlying(boolean flying) {
        isFlying = flying;
    }

    @Override
    public void examineAnimal() {
        super.examineAnimal();
        System.out.println("Animal sound : " + this.sound);
        String flying = (this.isFlying) ? "Currently flying" : "Not flying";
        System.out.println("Animal isFlying : " + flying);
    }

}
