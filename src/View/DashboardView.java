package View;


import java.util.Scanner;

public class DashboardView {

    public static int menu() {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");
        System.out.println("1 - Zoo Enclosures ");
        System.out.println("2 - Zoo Employees ");
        System.out.println("Q - Quit");

        selection = input.nextInt();
        return selection;
    }

}
