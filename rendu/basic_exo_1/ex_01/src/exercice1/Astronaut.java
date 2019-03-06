package exercice1;

import exercice1.planet.Mars;

public class Astronaut {
    String name;
    int snacks;
    private String destination;
    private int id;
    private static int counterId = 0;


    public Astronaut(String name) {
        this.name = name;
        System.out.println(name + " ready for launch!");
    }

    public void increaseId(){
        id = counterId++;
    }

    public void doActions(){
        System.out.println(name + " : nothing to do.");
    }

    public String getDestination() {

        return destination;
    }

    public int getId()  {
        this.increaseId();
        return id;
    }

    public int getSnacks() {
        return snacks;
    }
}
