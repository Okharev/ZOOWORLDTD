package View.Enclos;

import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;
import View.Animal.AnimalsView;
import View.DashboardView;

import java.util.ArrayList;
import java.util.Scanner;

public class EnclosuresView {

    private ArrayList<Enclosure> enclosures;
    private Zoo zoo;

    public EnclosuresView(ArrayList<Enclosure> enclosures, Zoo zoo) {
        this.enclosures = enclosures;
        this.zoo = zoo;
    }


    public void menu()
    {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Examine which enclosure");
        System.out.println("==========================================");

        for(int i = 1; i < enclosures.size() + 1; i++)
        {
            int count = i - 1;
            System.out.println(i + " Enclosure " + enclosures.get(count).getName());
        }

        System.out.println("\n0 - Return");

        selection = input.nextInt();

        if (selection == 0) {
            DashboardView dashboardView = new DashboardView(this.zoo);
            dashboardView.menu();
        }

        EnclosureView enclosureView = new EnclosureView(this.enclosures.get(selection - 1), enclosures, zoo);
        enclosureView.menu();

    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void setEnclosures(ArrayList<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }
}
