package Model.Animal;

import Model.Enclos.DefaultEnclosure;

import java.util.Date;

public class Auk extends Avian{
    public boolean isSwimmming;
    public boolean isWalking;
    public boolean isFlying;
    public String sound;


        public Auk(String name, int weight,  int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health, boolean isSwimmming, boolean isWalking, boolean isFlying) {
        super("auk", name, weight, height, dateOfBirth, hunger, sleeping, gender, health);

        this.isSwimmming = isSwimmming;
        this.isWalking = isWalking;
        this.isFlying = isFlying;
        this.sound = "AckAckAckAckAckAck";
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

    public boolean isWalking() {
        return isWalking;
    }

    public void setWalking(boolean walking) {
        isWalking = walking;
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
        System.out.println("Animal isVagabonding : " + this.isSwimmming);
        System.out.println("Animal isVagabonding : " + this.isWalking);
        System.out.println("Animal isVagabonding : " + this.isFlying);
    }

}
