package View.Enclos;

import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;
import View.Animal.AnimalsView;

import java.util.ArrayList;
import java.util.Scanner;

public class EnclosureView {

    private Enclosure enclosure;
    private ArrayList<Enclosure> enclosures;
    private Zoo zoo;

    public EnclosureView(Enclosure enclosure, ArrayList<Enclosure> enclosures, Zoo zoo) {
        this.enclosure = enclosure;
        this.enclosures = enclosures;
        this.zoo = zoo;
    }


    public void menu()
    {
        int selection;
        Scanner input = new Scanner(System.in);


        enclosure.examineEnclosure();
        System.out.println("\nChoose from these options");
        System.out.println("==========================================");
        System.out.println("1 - check enclosure animals");
        System.out.println("2 - clean enclosure animals");
        System.out.println("==========================================");

        System.out.println("\n0 - Return");


        selection = input.nextInt();

        if(selection == 1) {
            AnimalsView animalsView = new AnimalsView(this.enclosure.getAnimals(), this.enclosure, this.enclosures, zoo);
            animalsView.menu();
        } else if (selection == 0) {
            EnclosuresView enclosuresView = new EnclosuresView(this.enclosures, zoo);
            enclosuresView.menu();
        }
    }
}
