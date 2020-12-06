package View.Enclos;

import Model.Animal.Animal;
import Model.Employe.Employee;
import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;
import View.Animal.AnimalsView;

import java.util.ArrayList;
import java.util.Scanner;

public class EnclosureView {

    private final Enclosure enclosure;
    private final ArrayList<Enclosure> enclosures;
    private final Zoo zoo;

    public EnclosureView(Enclosure enclosure, ArrayList<Enclosure> enclosures, Zoo zoo) {
        this.enclosure = enclosure;
        this.enclosures = enclosures;
        this.zoo = zoo;
    }


    public void menu() {
        int selection;
        Scanner input = new Scanner(System.in);


        enclosure.examineEnclosure();
        System.out.println("\nChoose from these options");
        System.out.println("==========================================");
        System.out.println("\u001B[36m" + "1 - check enclosure animals");
        System.out.println("2 - clean enclosure animals");
        System.out.println("3 - feed enclosure animals");
        System.out.println("4 - move to new enclosure");
        System.out.println("5 - remove animal from enclosure" + "\u001B[0m");
        System.out.println("==========================================");

        System.out.println("\n0 - Return");

        while (true) {
            try {
                selection = input.nextInt();

                if (selection == 1) {
                    AnimalsView animalsView = new AnimalsView(this.enclosure.getAnimals(), this.enclosure, this.enclosures, zoo);
                    animalsView.menu();
                    break;
                } else if (selection == 2) {
                    System.out.println("what temp enclosure : ");

                    int selectionCleaning;
                    Scanner inputCleaning = new Scanner(System.in);

                    for (int i = 1; i < enclosures.size() + 1; i++) {
                        int count = i - 1;
                        System.out.println(i + " Enclosure " + enclosures.get(count).getName());
                    }

                    selection = input.nextInt();

                    Employee employee = zoo.getEmployee();

                    employee.cleanEnclosure(enclosure, this.enclosures.get(selection - 1));

                    EnclosureView enclosureView = new EnclosureView(this.enclosure, enclosures, zoo);
                    enclosureView.menu();
                    break;
                } else if (selection == 3) {

                    Employee employee = zoo.getEmployee();

                    employee.feedEnclosure(enclosure);

                    System.out.println("\n");
                    EnclosureView enclosureView = new EnclosureView(this.enclosure, enclosures, zoo);
                    enclosureView.menu();
                    break;

                } else if (selection == 4) {

                    System.out.println("what animal to move : ");

                    int selectionAnimal;
                    Scanner inputAnimal = new Scanner(System.in);

                    ArrayList<Animal> animals = enclosure.getAnimals();

                    for (int i = 1; i < animals.size() + 1; i++) {
                        int count = i - 1;
                        System.out.println(i + " Animal  : " + animals.get(count).getName() + "  " + animals.get(count).getSpecie());
                    }
                    selectionAnimal = inputAnimal.nextInt();


                    System.out.println("what enclosure to move him to : ");

                    int selectionEnclosure;
                    Scanner inputEnclosure = new Scanner(System.in);

                    for (int i = 1; i < enclosures.size() + 1; i++) {
                        int count = i - 1;
                        System.out.println(i + " Enclosure " + enclosures.get(count).getName());
                    }
                    selectionEnclosure = inputEnclosure.nextInt();


                    Employee employee = zoo.getEmployee();

                    employee.moveToNewEnclosure(enclosure, animals.get(selectionAnimal - 1), enclosures.get(selectionEnclosure - 1));

                    EnclosureView enclosureView = new EnclosureView(this.enclosure, enclosures, zoo);
                    enclosureView.menu();
                    break;

                } else if (selection == 5) {
                    zoo.randomize();

                    System.out.println("what animal to remove : ");

                    int selectionAnimal;
                    Scanner inputAnimal = new Scanner(System.in);

                    ArrayList<Animal> animals = enclosure.getAnimals();

                    for (int i = 1; i < animals.size() + 1; i++) {
                        int count = i - 1;
                        System.out.println(i + " Animal  : " + animals.get(count).getName() + "  " + animals.get(count).getSpecie());
                    }
                    selectionAnimal = inputAnimal.nextInt();

                    enclosure.removeAnimal(animals.get(selectionAnimal - 1));

                    EnclosuresView enclosuresView = new EnclosuresView(this.enclosures, zoo);
                    enclosuresView.menu();
                    break;
                } else if (selection == 0) {
                    zoo.randomize();

                    EnclosuresView enclosuresView = new EnclosuresView(this.enclosures, zoo);
                    enclosuresView.menu();
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
