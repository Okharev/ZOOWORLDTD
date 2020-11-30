package Model.Enclos;

import Model.Animal.Animal;

import java.util.ArrayList;

public class AquariumEnclosure extends Enclosure{

    private float prefferedDepth;
    private float currentDepth;
    private float prefferedSaltiness;
    private float currentSaltiness;

    public AquariumEnclosure(String name, int surfaceArea, int nbMaxAnimals, ArrayList<Animal> animals, Status status , float prefferedDepth, float currentDepth, float prefferedSaltiness, float currentSaltiness) {
        super(name, surfaceArea, nbMaxAnimals, animals, status);

        // Gets the abs diff between curr and desired depth and saltiness
        float depth = Math.abs(Math.abs(prefferedDepth) - Math.abs(currentDepth));
        float salt = Math.abs(Math.abs(prefferedSaltiness) - Math.abs(currentSaltiness));

        if( depth >= 20 || salt >= 20) {
            super.setStatus(DefaultEnclosure.Status.BAD);
            /*
            System.out.println("les taux de sel  " + currentSaltiness + " besoin de -> " + prefferedSaltiness);
            System.out.println("profondeur :  " + currentDepth + " besoin de -> " + prefferedDepth);*/
        }
        else if( depth >= 10 || salt >= 10) {
            super.setStatus(DefaultEnclosure.Status.CORRECT);
            /*
            System.out.println("les taux de sel  " + currentSaltiness + " besoin de -> " + prefferedSaltiness);
            System.out.println("profondeur :  " + currentDepth + " besoin de -> " + prefferedDepth);*/
        }
        else
            super.setStatus(DefaultEnclosure.Status.GOOD);

        this.prefferedDepth = prefferedDepth;
        this.currentDepth = currentDepth;
        this.prefferedSaltiness = prefferedSaltiness;
        this.currentSaltiness = currentSaltiness;
    }


    public float getPrefferedDepth() {
        return prefferedDepth;
    }

    public void setPrefferedDepth(float prefferedDepth) {
        this.prefferedDepth = prefferedDepth;
    }

    public float getCurrentDepth() {
        return currentDepth;
    }

    public void setCurrentDepth(float currentDepth) {
        this.currentDepth = currentDepth;
    }

    public float getPrefferedSaltiness() {
        return prefferedSaltiness;
    }

    public void setPrefferedSaltiness(float prefferedSaltiness) {
        this.prefferedSaltiness = prefferedSaltiness;
    }

    public float getCurrentSaltiness() {
        return currentSaltiness;
    }

    public void setCurrentSaltiness(float currentSaltiness) {
        this.currentSaltiness = currentSaltiness;
    }

    @Override
    public String toString() {
        return "AquariumEnclosure{" +
                super.toString() +
                "prefferedDepth=" + prefferedDepth +
                ", currentDepth=" + currentDepth +
                ", prefferedSaltiness=" + prefferedSaltiness +
                ", currentSaltiness=" + currentSaltiness +
                '}';
    }
}
