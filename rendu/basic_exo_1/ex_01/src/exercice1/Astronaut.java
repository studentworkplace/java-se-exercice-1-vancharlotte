package exercice1;

import exercice1.chocolate.Mars;

public class Astronaut {

    private String name;
    private Mars snacks;
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

    }

    public void doActions(exercice1.planet.Mars destination) {
        this.destination = destination;
        Mars snacks = new Mars();
        this.snacks=snacks;

        if (destination == null) {
            System.out.println(name + " : I may have done nothing, but I have " + snacks.getId() + " Mars to eat at least !");
        }
        else {
            System.out.println(name + " : started a mission!");
         }
     }

    public void doActions ( Mars snacks) {
        this.snacks = snacks;
        if(snacks==null){
            this.destination=destination;
            doActions(destination);
        }
        else {
            System.out.println(name + " is eating mars number " + snacks.getId());
        }
    }
    public String getName() {
        return name;
    }

    public exercice1.planet.Mars getDestination() {
        return destination;
    }

    public int getId()  {
        return id;
    }

    public Mars getSnacks() {
        return snacks;
    }

}
