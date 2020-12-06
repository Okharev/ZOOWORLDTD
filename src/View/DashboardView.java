package View;


import Model.Zoo.Zoo;
import View.Enclos.EnclosuresView;

import java.util.Scanner;

public class DashboardView {

    private final Zoo zoo;

    public DashboardView(Zoo zoo) {
        this.zoo = zoo;
    }

    public void menu() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome To your Zoo " + this.zoo.getName());
        System.out.println("==========================================");
        System.out.println("\u001B[36m" + "1 - Zoo Enclosures ");
        System.out.println("2 - Zoo status \n" + "\u001B[0m");

        System.out.println("Taking care of : " + zoo.nbAnimalsInZoo() + " Animals \n");

        System.out.println("0 - Quit \n");

        while (true)
        {
            try {
                selection = input.nextInt();

                if(selection == 1)
                {

                    zoo.randomize();
                    EnclosuresView enclosView = new EnclosuresView(zoo.getEnclosures(), zoo);
                    enclosView.menu();
                    break;
                }
                if(selection == 2)
                {

                    zoo.randomize();

                    ZooStatusView ZooStatusView = new ZooStatusView(zoo);
                    ZooStatusView.menu();
                    break;
                }
                if(selection == 3)
                {

                    zoo.randomize();

                    EnclosuresView enclosView = new EnclosuresView(zoo.getEnclosures(), zoo);
                    enclosView.menu();
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
