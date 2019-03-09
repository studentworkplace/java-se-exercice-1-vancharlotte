package exercice1;

import exercice1.chocolate.Mars;

public class Astronaut {
    private String name;
    private int snacks;
    private exercice1.planet.Mars destination;
    private int id;
    private static int counterId = 0;


    public Astronaut(String name) {
        this.name = name;
        this.id = counterId++;
        System.out.println(name + " ready for launch!");

    }
    public void doActions(){
        System.out.println(name + " : nothing to do.");
        snacks++;
        System.out.println(name + " : I may have done nothing, but I have " + snacks + " Mars to eat at least !");
    }

    public void doActions(exercice1.planet.Mars destination){
        exercice1.planet.Mars mars = new exercice1.planet.Mars();
        this.destination = mars;
        System.out.println(name + " : started a mission!");
    }


    public void doActions (boolean givenSnacks) {
        if (givenSnacks) {
            snacks++;
            System.out.println(name + " is eating mars number " + snacks);
        } else {
            this.doActions();
        }
    }


    public exercice1.planet.Mars getDestination() {
        return destination;
    }

    public int getId()  {
        return id;
    }

    public int getSnacks() {
        return snacks;
    }

}
