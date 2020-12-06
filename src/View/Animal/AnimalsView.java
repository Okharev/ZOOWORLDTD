package View.Animal;

import Model.Animal.Animal;
import Model.Employe.Employee;
import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;
import View.Enclos.EnclosureView;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalsView {

    private final ArrayList<Animal> animals;
    private final Enclosure enclosure;
    private final ArrayList<Enclosure> enclosures;
    private final Zoo zoo;

    public AnimalsView(ArrayList<Animal> animals, Enclosure enclosure, ArrayList<Enclosure> enclosures, Zoo zoo) {
        this.animals = animals;
        this.enclosure = enclosure;
        this.enclosures = enclosures;
        this.zoo = zoo;
    }


    public void menu() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("\nChoose from these options");
        System.out.println("==========================================");
        System.out.println("\u001B[36m" + "1 - heal specified animals" + "\u001B[0m");
        System.out.println("==========================================");

        for (int i = 1; i < animals.size() + 1; i++) {
            int count = i - 1;
            animals.get(count).examineAnimal();
        }

        System.out.println("-------------------------\n");

        System.out.println("0 - Return");

        while (true) {
            try {
                selection = input.nextInt();

                if (selection == 0) {

                    zoo.randomize();

                    EnclosureView enclosureView = new EnclosureView(enclosure, enclosures, zoo);
                    enclosureView.menu();
                    break;
                } else if (selection == 1) {

                    zoo.randomize();

                    System.out.println("what animal to heal : ");

                    int selectionAnimal;
                    Scanner inputAnimal = new Scanner(System.in);

                    ArrayList<Animal> animals = enclosure.getAnimals();

                    for (int i = 1; i < animals.size() + 1; i++) {
                        int count = i - 1;
                        System.out.println(i + " Animal  : " + animals.get(count).getName() + "  " + animals.get(count).getSpecie());
                    }

                    selectionAnimal = inputAnimal.nextInt();

                    Employee employee = zoo.getEmployee();

                    employee.healAnimal(animals.get(selectionAnimal - 1));

                    EnclosureView enclosureView = new EnclosureView(enclosure, enclosures, zoo);
                    enclosureView.menu();
                    break;
                } else if (selection <= this.animals.size()) {

                    zoo.randomize();

                    AnimalView animalView = new AnimalView(this.animals.get(selection - 1), animals, enclosure, enclosures, zoo);
                    animalView.menu();
                    break;
                } else {
                    menu();
                    break;
                }
            } catch (Exception e) {
                menu();
            }
        }

    }
}
