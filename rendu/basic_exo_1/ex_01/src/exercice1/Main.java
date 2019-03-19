package exercice1;

import exercice1.planet.moon.Phobos;
import exercice1.planet.Mars;

public class Main {

    public static void main(String[] args) {
        Astronaut mutta = new Astronaut("Mutta");
        Astronaut hibito = new Astronaut("Hibito");
        Astronaut serika = new Astronaut("Serika");

        Team spaceBro = new Team("SpaceBrothers");

        spaceBro.add(mutta);
        spaceBro.add(hibito);
        spaceBro.add(serika);
        spaceBro.add(3);

        System.out.println(spaceBro.countMembers());

    }
}
