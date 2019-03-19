package exercice1;

import exercice1.chocolate.Mars;
import java.util.*;
import java.util.stream.Stream;

public class Team extends Astronaut{
    String name;
    List<Object> teamMembers = new ArrayList();
    Astronaut astronaut;
    Mars snacks;
    Object destination;
    String mission;

    public String getName() {
        return name;
    }

    public Team(String name) {
        super(name);
        this.name = name;

    }

    /*add: It takes an Astronaut as parameter. This Astronaut should be added to the team.*/
    public void add(Object astronaut) {
        if (astronaut instanceof Astronaut) {
            this.teamMembers.add(astronaut);
        } else {
            System.out.println(name + " : Sorry, you are not part of the team.");

        }
    }


    /*remove**: It takes an astronaut as parameter and removes him from the team. This function never displays anything.*/
    public void remove(Object astronaut) {
        this.teamMembers.remove(astronaut);
    }

    /*countMembers**: It returns the number of Astronaut currently on our team.*/
    public int countMembers() {
        return teamMembers.size();
    }

    // ShowMembers**: It displays the members that are on the team and if they are currently on a mission.
     public void showMembers() {
        System.out.print( name + " : ");
        for (Object astronaut : teamMembers) {

            if (!(((Astronaut) astronaut).getDestination() == null)) {
                System.out.print(((Astronaut) astronaut).getName() + " en mission, ");
            } else {
                System.out.print(((Astronaut) astronaut).getName() + " en standby, ");
            }
        }
        System.out.print("\n");

    }

  }





