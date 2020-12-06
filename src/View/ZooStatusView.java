package View;

import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;


import java.util.Scanner;

public class ZooStatusView {

    private final Zoo zoo;

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
            if(enclosure.getStatus() == Enclosure.Status.BAD)
                System.out.println("\u001B[31m" + "Enclosure " + enclosure.getName() + " " + enclosure.getStatus() + "\u001B[0m");
            else if (enclosure.getStatus() == Enclosure.Status.CORRECT)
                System.out.println("\u001B[33m" + "Enclosure " + enclosure.getName() + " " + enclosure.getStatus() + "\u001B[0m");
            else
                System.out.println("Enclosure " + enclosure.getName() + " " + enclosure.getStatus());
        }

        System.out.println("=================Animals===================");

         zoo.animalsInfoZoo();

        System.out.println("0 - Return \n");

        while (true)
        {
            try {
                selection = input.nextInt();

                if (selection == 0) {
                    zoo.randomize();
                    DashboardView dashboardView = new DashboardView(this.zoo);
                    dashboardView.menu();
                    break;
                } else {
                    zoo.randomize();
                    menu();
                    break;
                }
            } catch (Exception e)
            {
                menu();
            }
        }
    }
}
