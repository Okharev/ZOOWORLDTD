package Controller;

import Model.Animal.Animal;
import View.Animal.AnimalView;

import java.util.Scanner;

public class AnimalController {

    private Animal model;
    private AnimalView view;

    public AnimalController(Animal model, AnimalView view) {
        this.model = model;
        this.view = view;
    }

    public void showAnimal()
    {
        //view.menu(model);
    }

}
