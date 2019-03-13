package exercice1;

import exercice1.planet.Mars;

public class Main {

    public static void main(String[] args) {
        Astronaut neilAmstrong = new Astronaut("Neil Amstrong");
        Astronaut youriGagarine = new Astronaut("Youri Gagarine");

        System.out.println(neilAmstrong.getId());
        System.out.println(youriGagarine.getId());

        youriGagarine.doActions();
        Mars mars = new Mars(0);
        youriGagarine.doActions(mars);
        youriGagarine.doActions(null);
        youriGagarine.doActions(true);
        System.out.println(youriGagarine.getSnacks());
    }
}
