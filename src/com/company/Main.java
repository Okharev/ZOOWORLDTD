package com.company;

import Controller.AnimalController;
import Model.Animal.Animal;
import Model.Animal.Tiger;
import Model.Animal.Wolf;
import Model.Employe.Employee;
import Model.Enclos.AquariumEnclosure;
import Model.Enclos.AvarianEnclosure;
import Model.Enclos.DefaultEnclosure;
import Model.Enclos.Enclosure;
import View.Animal.AnimalView;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        Wolf myWolf = new Wolf(15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.HEALTHY, true);
        Tiger myTiger = new Tiger(15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        ArrayList<Animal> myAnimals = new ArrayList<>();
        myAnimals.add(myTiger);
        myAnimals.add(myWolf);

        //AquariumEnclosure aquarium = new AquariumEnclosure("number one",  17,  20,  myAnimals, null , 50,  55,  60,  75);
        AvarianEnclosure avarian = new AvarianEnclosure("number one",  17,  20,  myAnimals, Enclosure.Status.BAD , 50,  50);
        avarian.cleanEnclosure();

        Employee employee = new Employee();
        System.out.println(employee.examineEnclosure(avarian));


    }
}
