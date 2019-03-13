package exercice1;

import exercice1.planet.Mars;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Team {

    private String name;
    List<Astronaut> teamMembers = new ArrayList<Astronaut>();
    Astronaut astronaut;

    public String getName() {
        return name;
    }


    public Team(String name) {
        this.name = name;
    }

    /*add: It takes an Astronaut as parameter. This Astronaut should be added to the team.*/
    public void add(Astronaut astronaut) {
        this.teamMembers = teamMembers;
        teamMembers.add(astronaut);
    }

    /*remove**: It takes an astronaut as parameter and removes him from the team. This function never displays anything.*/
    public void remove(Astronaut astronaut) {
        this.teamMembers = teamMembers;
        teamMembers.remove(astronaut);
    }

    /*countMembers**: It returns the number of Astronaut currently on our team.*/
    public int countMembers() {
        this.teamMembers = teamMembers;
        return teamMembers.size();
    }

    /* ShowMembers**: It displays the members that are on the team, the following way:
     [Team name]: [Astronaut 1] on mission,[Astronaut 2] on stanby.
     Obviously, "on mission" is displayed if the Astronaut is currently on a mission.
     Otherwise "on standby" is displayed.
     If no member is in the team, don't display anything.*/
    public void showMembers() {

         }


}







