package Model.Zoo;

import Model.Animal.Animal;
import Model.Employe.Employee;
import Model.Enclos.Enclosure;
import java.util.ArrayList;
import java.util.Random;

public class Zoo {

    private String name;
    private Employee employee;
    private int nbMaxEnclosures;
    private ArrayList<Enclosure> enclosures;


    public void setCount(int count) {
        this.count = count;
    }

    private int count = 0;


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
                if(animal.getHealth() == Animal.Health.SICK)
                    System.out.println("\u001B[33m" + "Animal : " + animal.getName() + " is: " + animal.getHealth() + "\u001B[0m");
                else if (animal.getHealth()  == Animal.Health.DEAD)
                    System.out.println("\u001B[31m" + "Animal : " + animal.getName() + " is: " + animal.getHealth() + "\u001B[0m");
                else
                    System.out.println("Animal : " + animal.getName() + " is: " + animal.getHealth());
            }

        }
    }

    public void randomize()
    {
        int count = getCount();

        setCount(count + 1);

        ArrayList<Animal> allAnimals = new ArrayList<>();

        for (Enclosure enclosure : this.enclosures)
        {
            allAnimals.addAll(enclosure.getAnimals());
        }


        if(count > 20)
        {
            for (Animal animal : allAnimals) {

                animal.setSleeping(false);
            }
        }

        if(count > 100)
        {
            for (Animal animal : allAnimals) {

                animal.setSleeping(true);
            }
            setCount(0);
        }

        Random r = new Random();
        int low = 0;
        int high = 100;
        int result = r.nextInt(high-low) + low;

        if(result < 5)
        {

            Random randomGenerator = new Random();
            int index = randomGenerator.nextInt(allAnimals.size());
            Animal animal = allAnimals.get(index);

            if (animal.getHealth() == Animal.Health.SICK)
            {
                animal.setHealth(Animal.Health.DEAD);
            } else {
                animal.setHealth(Animal.Health.SICK);
            }
        }

        if(result < 8)
        {
            Random randomGenerator = new Random();
            int index = randomGenerator.nextInt(enclosures.size());
            Enclosure enclosure = enclosures.get(index);

            enclosure.updateStatus();
        }
    }

    public int getCount() {
        return count;
    }
}
