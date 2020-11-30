package Model.Animal;

import java.util.ArrayList;
import java.util.Date;

public abstract class Animal {
    private String specie;
    private int weight;
    private int height;
    private java.util.Date dateOfBirth;
    private boolean hunger;
    private boolean sleeping;

    public Animal(String specie, int weight, int height, Date dateOfBirth, boolean hunger, boolean sleeping, Gender gender, Health health) {
        this.specie = specie;
        this.weight = weight;
        this.height = height;
        this.dateOfBirth = dateOfBirth;
        this.hunger = hunger;
        this.sleeping = sleeping;
        this.gender = gender;
        this.health = health;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "specie='" + specie + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                ", dateOfBirth=" + dateOfBirth +
                ", hunger=" + hunger +
                ", sleeping=" + sleeping +
                ", gender=" + gender +
                ", health=" + health +
                '}';
    }

    public enum Gender
    {
        FEMALE,
        MALE,
        OTHER
    } Gender gender;

    public enum Health
    {
        HEALTHY,
        SICK,
        DEAD
    } Health health;

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public boolean isHunger() {
        return hunger;
    }

    public void setHunger(boolean hunger) {
        this.hunger = hunger;
    }

    public boolean isSleeping() {
        return sleeping;
    }

    public void setSleeping(boolean sleeping) {
        this.sleeping = sleeping;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Health getHealth() {
        return health;
    }

    public void setHealth(Health health) {
        this.health = health;
    }

    public String eat(boolean hunger) {
        hunger = this.hunger;

        if(!hunger)
        {
            return "Not hungry";
        } else {
            return "I am hungry";
        }
    }

    // ! TODO get the sound of the given animal
    // ! Parler avec le prof sur l implementation de la fonction
    public String makeSound(String sound)
    {
        return sound;
    }

    public void heal(Health health)
    {
        health = this.health;
    }

    public void sleep(boolean sleeping)
    {
    }


}
