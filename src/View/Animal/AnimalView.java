package View.Animal;


import Model.Animal.Animal;
import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalView {

    private final Animal animal;
    private final ArrayList<Animal> animals;
    private final Enclosure enclosure;
    private final ArrayList<Enclosure> enclosures;
    private final Zoo zoo;

    public AnimalView(Animal animal, ArrayList<Animal> animals, Enclosure enclosure, ArrayList<Enclosure> enclosures, Zoo zoo) {
        this.animal = animal;
        this.animals = animals;
        this.enclosure = enclosure;
        this.enclosures = enclosures;
        this.zoo = zoo;
    }


    public void menu() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Animal view ");
        System.out.println("-------------------------\n");
        System.out.println("Animal name: ");
        System.out.println("Animal specie: " + this.animal.getSpecie());
        System.out.println("Animal weight: " + this.animal.getWeight());
        System.out.println("Animal height: ");
        System.out.println("Animal health: ");
        System.out.println("Animal hunger: ");
        System.out.println("Animal sleeping: ");
        System.out.println("Animal gender: ");

        System.out.println("-------------------------\n");
        System.out.println("0 - Return");
        while (true) {
            try {
                selection = input.nextInt();

                if (selection == 0) {

                    zoo.randomize();

                    AnimalsView animalsView = new AnimalsView(animals, enclosure, enclosures, zoo);
                    animalsView.menu();
                    break;

                } else {

                    zoo.randomize();

                    menu();
                    break;
                }
            } catch (Exception e) {
                menu();
            }

        }
    }
}
