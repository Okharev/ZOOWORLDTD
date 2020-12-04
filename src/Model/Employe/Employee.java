package Model.Employe;

import Model.Animal.Animal;
import Model.Enclos.Enclosure;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee {

    private String name;
    private int age;

    public Employee(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }

    public enum Sex
    {
        MALE,
        FEMALE,
        OTHER
    } Employee.Sex sex;

    public void cleanEnclosure(Enclosure enclosure, Enclosure newEnclosure)
    {
        ArrayList<Animal> enclosureAnimals = enclosure.getAnimals();

        ArrayList<Animal> animalsToDelete = new ArrayList<>();
        for (Animal animal: enclosureAnimals) {
            animalsToDelete.add(animal);
            newEnclosure.addAnimal(animal);
        }

        enclosure.removeAnimals(animalsToDelete);

        if(enclosure.cleanEnclosure())
        {
            ArrayList<Animal> animalsToDeleteTemp = new ArrayList<>();
            for (Animal animal: animalsToDelete) {
                animalsToDeleteTemp.add(animal);
                enclosure.addAnimal(animal);
            }
            newEnclosure.removeAnimals(animalsToDeleteTemp);
        }
    }

    public String examineEnclosure(Enclosure enclosure)
    {
        return enclosure.toString();
    }

    public void moveToNewEnclosure(Enclosure oldEnclosure, Animal animal ,Enclosure newEnclosure)
    {
        if(newEnclosure.getRemainingSpace() > 0)
        {
            oldEnclosure.removeAnimal(animal);
            newEnclosure.addAnimal(animal);
        }
    }

    public void feedEnclosure(Enclosure enclosure)
    {
        enclosure.feedHungryAnimals();
    }

}
