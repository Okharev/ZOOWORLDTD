package View.Animal;


import Model.Animal.Animal;

public class AnimalView {

    public AnimalView() {
    }

    public void menu(Animal animal)
    {
        System.out.println("Animal view ");
        System.out.println("-------------------------\n");
        System.out.println("Animal name: ");
        System.out.println("Animal specie: " + animal.getSpecie());
        System.out.println("Animal weight: "  + animal.getWeight());
        System.out.println("Animal height: ");
        System.out.println("Animal health: ");
        System.out.println("Animal hunger: ");
        System.out.println("Animal sleeping: ");
        System.out.println("Animal gender: ");
        System.out.println("Q - Quit");
    }

}
