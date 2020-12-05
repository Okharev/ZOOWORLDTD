package View.Animal;

import Model.Animal.Animal;
import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;
import View.Enclos.EnclosureView;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class AnimalsView {

    private ArrayList<Animal> animals;
    private Enclosure enclosure;
    private ArrayList<Enclosure> enclosures;
    private Zoo zoo;

    public AnimalsView(ArrayList<Animal> animals, Enclosure enclosure, ArrayList<Enclosure> enclosures, Zoo zoo) {
        this.animals = animals;
        this.enclosure = enclosure;
        this.enclosures = enclosures;
        this.zoo = zoo;
    }


    public void menu()
    {
        int selection;
        Scanner input = new Scanner(System.in);

        System.out.println("Choose from these choices");
        System.out.println("-------------------------\n");

        for(int i = 1; i < animals.size() + 1; i++)
        {
            int count = i - 1;
            animals.get(count).examineAnimal();
        }

        System.out.println("-------------------------\n");

        System.out.println("0 - Return");

        while (true)
        {
            try {
                selection = input.nextInt();

                if(selection == 0) {
                    EnclosureView enclosureView = new EnclosureView(enclosure, enclosures, zoo);
                    enclosureView.menu();
                    break;
                } else if(selection <= this.animals.size()) {
                    AnimalView animalView = new AnimalView(this.animals.get(selection - 1), animals, enclosure, enclosures, zoo);
                    animalView.menu();
                    break;
                } else {
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
