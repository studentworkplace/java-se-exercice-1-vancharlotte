package exercice1;

import exercice1.planet.moon.Phobos;
import exercice1.planet.Mars;

public class Main {

    public static void main(String[] args) {
        Astronaut neilAmstrong = new Astronaut("Neil Amstrong");
        Astronaut youriGagarine = new Astronaut("Youri Gagarine");

 /**    System.out.println(neilAmstrong.getId());
        System.out.println(youriGagarine.getId());

        youriGagarine.doActions();
        Mars mars = new Mars(0);
        youriGagarine.doActions(mars);
        youriGagarine.doActions((Mars) null);
        exercice1.chocolate.Mars snacks = new exercice1.chocolate.Mars();
        youriGagarine.doActions(snacks);
*/
        Mars titi = new Mars();
        Mars toto = new Mars();

        new Phobos(titi);
        new Phobos(toto);


    }
}
