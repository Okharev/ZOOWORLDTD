package com.company;

import View.DashboardView;
import Controller.AnimalController;
import Model.Animal.Animal;
import Model.Animal.Tiger;
import Model.Employe.Employee;
import Model.Enclos.DefaultEnclosure;
import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;
import View.Animal.AnimalView;

import javax.swing.text.View;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {


        DefaultEnclosure mammalEnclosure = new DefaultEnclosure("Mammal enclo need cleaning 1", 150, 20, new ArrayList<>(), Enclosure.Status.BAD);

        DefaultEnclosure mammalTempEnclosure = new DefaultEnclosure("Mammal enclo 1 tempo", 150, 20, new ArrayList<>(), Enclosure.Status.GOOD);

        DefaultEnclosure mammalTempEnclosureTwo = new DefaultEnclosure("Mammal enclo 1 tempo", 150, 20, new ArrayList<>(), Enclosure.Status.BAD);

        Tiger myTiger1 = new Tiger("Wammu",15, 18, new Date(), false, false , Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Tiger myTiger2 = new Tiger("ACDC",15, 18, new Date(), true, false , Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Tiger myTiger3 = new Tiger("CEASAR",15, 18, new Date(), true, false , Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        Tiger myTiger4 = new Tiger("Charly", 15, 18, new Date(), false, false , Animal.Gender.MALE, Animal.Health.SICK, true);
        Tiger myTiger5 = new Tiger("Roger",15, 18, new Date(), true, false , Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Tiger myTiger6 = new Tiger("Tango",15, 18, new Date(), true, false , Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        Tiger myTiger7 = new Tiger("Charly", 15, 18, new Date(), false, false , Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Tiger myTiger8 = new Tiger("Roger",15, 18, new Date(), true, false , Animal.Gender.MALE, Animal.Health.SICK, true);
        Tiger myTiger9 = new Tiger("Tango",15, 18, new Date(), true, false , Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        mammalEnclosure.addAnimal(myTiger1);
        mammalEnclosure.addAnimal(myTiger2);
        mammalEnclosure.addAnimal(myTiger3);

        mammalTempEnclosure.addAnimal(myTiger4);
        mammalTempEnclosure.addAnimal(myTiger5);
        mammalTempEnclosure.addAnimal(myTiger6);

        mammalTempEnclosureTwo.addAnimal(myTiger7);
        mammalTempEnclosureTwo.addAnimal(myTiger8);
        mammalTempEnclosureTwo.addAnimal(myTiger9);

        ArrayList<Enclosure> enclosures = new ArrayList<>();
        enclosures.add(mammalEnclosure);
        enclosures.add(mammalTempEnclosure);
        enclosures.add(mammalTempEnclosureTwo);

        Employee employee = new Employee("Zubi", 30, Employee.Sex.FEMALE);

        Zoo myZoo = new Zoo("Zooland", employee, 20, enclosures);

        System.out.println(myZoo.enclosureInfo(mammalEnclosure));


        /*
        Tiger myTiger1 = new Tiger("Wammu",15, 18, new Date(), false, false , Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        AnimalView myView = new AnimalView();


        AnimalController c =  new AnimalController(myTiger1, myView);

        c.showAnimal();*/

        DashboardView dash = new DashboardView(myZoo);

        dash.menu();

    }
}
