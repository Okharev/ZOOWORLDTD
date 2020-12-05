package Model.Zoo;

import Model.Animal.Animal;
import Model.Employe.Employee;
import Model.Enclos.Enclosure;

import java.util.ArrayList;

public class Zoo {

    private String name;
    private Employee employee;
    private int nbMaxEnclosures;
    private ArrayList<Enclosure> enclosures;


    public Zoo(String name, Employee employee, int nbMaxEnclosures, ArrayList<Enclosure> enclosures) {
        this.name = name;
        this.employee = employee;
        this.nbMaxEnclosures = nbMaxEnclosures;
        this.enclosures = enclosures;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public int getNbMaxEnclosures() {
        return nbMaxEnclosures;
    }

    public void setNbMaxEnclosures(int nbMaxEnclosures) {
        this.nbMaxEnclosures = nbMaxEnclosures;
    }

    public ArrayList<Enclosure> getEnclosures() {
        return enclosures;
    }

    public void setEnclosures(ArrayList<Enclosure> enclosures) {
        this.enclosures = enclosures;
    }

    public int nbAnimalsInZoo() {

        int nbAnimals = 0;

        for (Enclosure enclosure :
                this.enclosures) {

            nbAnimals += enclosure.getNbCurrAnimals();

        }

        return nbAnimals;
    }

    public String enclosureInfo(Enclosure enclosure) {

        String info = "";

        info += enclosure.getName();

        for (Animal animal : enclosure.getAnimals())
        {
            info += animal.getSpecie();
        }

        return info;
    }

    public void animalsInfoZoo() {

        for (Enclosure enclosure :
                this.enclosures) {
            System.out.println("\n");

            System.out.println(enclosure.getName());

            for (Animal animal : enclosure.getAnimals())
            {
                System.out.println(animal.getSpecie() +" : " + animal.getName() + " Status :" + animal.getHealth());
            }

        }
    }
}
