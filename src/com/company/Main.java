package com.company;

import Model.Animal.*;
import Model.Employe.Employee;
import Model.Enclos.AquariumEnclosure;
import Model.Enclos.AvarianEnclosure;
import Model.Enclos.DefaultEnclosure;
import Model.Enclos.Enclosure;
import Model.Zoo.Zoo;
import View.DashboardView;

import java.util.ArrayList;
import java.util.Date;

public class Main {

    /**
     * @param args
     */
    public static void main(String[] args) {

        //Mammal
        DefaultEnclosure mammalEnclosure = new DefaultEnclosure("Enclos 1", 150, 20, new ArrayList<>(), Enclosure.Status.GOOD);
        DefaultEnclosure mammalTempEnclosure = new DefaultEnclosure("Enclos 2", 150, 20, new ArrayList<>(), Enclosure.Status.BAD);
        DefaultEnclosure mammalTempEnclosureTwo = new DefaultEnclosure("Enclos 3", 150, 20, new ArrayList<>(), Enclosure.Status.CORRECT);

        Tiger myTiger1 = new Tiger("Nelledu", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Wolf myWolf1 = new Wolf("Tychou", 15, 18, new Date(), true, true, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Tiger myTiger2 = new Tiger("Llenta", 15, 18, new Date(), true, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        Tiger myTiger3 = new Tiger("Settegyp", 15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.SICK, true);
        Bear myBear1 = new Bear("Gomspag", 15, 18, new Date(), true, true, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Wolf myWolf2 = new Wolf("Kirlon", 15, 18, new Date(), true, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        Wolf myWolf3 = new Wolf("Endex", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Bear myBear2 = new Bear("Gizdle", 15, 18, new Date(), true, true, Animal.Gender.MALE, Animal.Health.SICK, true);
        Bear myBear3 = new Bear("Sutag", 15, 18, new Date(), true, false, Animal.Gender.FEMALE, Animal.Health.HEALTHY, true);

        //Aquatic
        AquariumEnclosure aquariumEnclosure = new AquariumEnclosure("Aquarium 1", 150, 20, new ArrayList<>(), Enclosure.Status.GOOD, 50, 40, 50, 40);
        AquariumEnclosure aquariumTempEnclosure = new AquariumEnclosure("Aquarium 2", 150, 20, new ArrayList<>(), Enclosure.Status.BAD, 50, 30, 50, 60);
        AquariumEnclosure aquariumTemp1Enclosure = new AquariumEnclosure("Aquarium 3", 150, 20, new ArrayList<>(), Enclosure.Status.GOOD, 50, 40, 50, 40);

        RedFish myRedFish1 = new RedFish("Xyban", 15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.HEALTHY, true);
        Shark myShark1 = new Shark("Rasto", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.SICK, true);
        Whale myWhale1 = new Whale("Willy", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        Whale myWhale2 = new Whale("Yogi", 15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.HEALTHY, true);
        Whale myWhale3 = new Whale("Curspag", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        RedFish RedFish2 = new RedFish("Dory", 15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.HEALTHY, true);

        Shark myShark2 = new Shark("Shiru", 15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.HEALTHY, true);
        Shark myShark3 = new Shark("Choume", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.SICK, true);
        RedFish RedFish3 = new RedFish("Nemo", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        //Avian
        AvarianEnclosure avarianEnclosure = new AvarianEnclosure("Aviary 1", 150, 20, new ArrayList<>(), Enclosure.Status.CORRECT, 50, 40);
        AvarianEnclosure avarianTempEnclosure = new AvarianEnclosure("Aviary 2", 150, 20, new ArrayList<>(), Enclosure.Status.GOOD, 50, 50);
        AvarianEnclosure avarianTemp1Enclosure = new AvarianEnclosure("Aviary 3", 150, 20, new ArrayList<>(), Enclosure.Status.BAD, 50, 30);

        Eagle myEagle1 = new Eagle("Cetteab", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Auk myAuk1 = new Auk("Terchou", 15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.SICK, true, false, false);
        Eagle myEagle2 = new Eagle("Bisney", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);

        Eagle myEagle3 = new Eagle("Fisa", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Eagle myEagle4 = new Eagle("Nebouille", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Auk myAuk2 = new Auk("Saki", 15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.HEALTHY, false, false, true);

        Auk myAuk3 = new Auk("Ookcho", 15, 18, new Date(), false, false, Animal.Gender.FEMALE, Animal.Health.SICK, false, true, false);
        Eagle myEagle5 = new Eagle("Ome", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, true);
        Auk myAuk4 = new Auk("Gauma", 15, 18, new Date(), false, false, Animal.Gender.MALE, Animal.Health.HEALTHY, false, false, true);


        //Mammal
        mammalEnclosure.addAnimal(myTiger1);
        mammalEnclosure.addAnimal(myWolf1);
        mammalEnclosure.addAnimal(myTiger2);

        mammalTempEnclosure.addAnimal(myTiger3);
        mammalTempEnclosure.addAnimal(myBear1);
        mammalTempEnclosure.addAnimal(myWolf2);

        mammalTempEnclosureTwo.addAnimal(myWolf3);
        mammalTempEnclosureTwo.addAnimal(myBear2);
        mammalTempEnclosureTwo.addAnimal(myBear3);

        //Aquatic
        aquariumEnclosure.addAnimal(myRedFish1);
        aquariumEnclosure.addAnimal(myShark1);
        aquariumEnclosure.addAnimal(myWhale1);

        aquariumTempEnclosure.addAnimal(myWhale2);
        aquariumTempEnclosure.addAnimal(myWhale3);
        aquariumTempEnclosure.addAnimal(RedFish2);

        aquariumTemp1Enclosure.addAnimal(myShark2);
        aquariumTemp1Enclosure.addAnimal(myShark3);
        aquariumTemp1Enclosure.addAnimal(RedFish3);

        //Aviary
        avarianEnclosure.addAnimal(myEagle1);
        avarianEnclosure.addAnimal(myAuk1);
        avarianEnclosure.addAnimal(myEagle2);

        avarianTempEnclosure.addAnimal(myEagle3);
        avarianTempEnclosure.addAnimal(myEagle4);
        avarianTempEnclosure.addAnimal(myAuk2);

        avarianTemp1Enclosure.addAnimal(myAuk3);
        avarianTemp1Enclosure.addAnimal(myEagle5);
        avarianTemp1Enclosure.addAnimal(myAuk4);

        ArrayList<Enclosure> enclosures = new ArrayList<>();
        enclosures.add(mammalEnclosure);
        enclosures.add(mammalTempEnclosure);
        enclosures.add(mammalTempEnclosureTwo);

        enclosures.add(aquariumEnclosure);
        enclosures.add(aquariumTempEnclosure);
        enclosures.add(aquariumTemp1Enclosure);

        enclosures.add(avarianEnclosure);
        enclosures.add(avarianTempEnclosure);
        enclosures.add(avarianTemp1Enclosure);


        Employee employee = new Employee("Rosette", 30, Employee.Sex.FEMALE);

        Zoo myZoo = new Zoo("Zooland", employee, 20, enclosures);

        System.out.println(myZoo.enclosureInfo(mammalEnclosure));

        DashboardView dash = new DashboardView(myZoo);

        dash.menu();
    }
}
