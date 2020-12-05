package View;

import Model.Animal.Animal;
import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;
import View.Enclos.EnclosuresView;

import java.util.Scanner;

public class ZooStatusView {

    private Zoo zoo;

    public ZooStatusView(Zoo zoo) {
        this.zoo = zoo;
    }

    public void menu() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Your Zoo Status");
        System.out.println("================Enclosures=================");

        for(Enclosure enclosure : zoo.getEnclosures())
        {
            System.out.println(enclosure.getName() + " " + enclosure.getStatus());
        }

        System.out.println("=================Animals===================");

         zoo.animalsInfoZoo();

        System.out.println("0 - Return \n");

        selection = input.nextInt();

        if (selection == 0) {
            DashboardView dashboardView = new DashboardView(this.zoo);
            dashboardView.menu();
        }
    }
}