package exercice1.planet.moon;

import exercice1.planet.Mars;

public class Phobos {

    private Mars mars;


    public Phobos(Mars mars) {
        this.mars = mars;
        if (mars == null){
            System.out.println("No planet given.");
        }
        else{
            System.out.println("Phobos placed in orbit.");
        }

    }

    public Mars getMars() {
        return mars;
    }

}
