package exercice1.chocolate;

public class Mars {

    private int id;
    private static int counterId = 0;

    public Mars(){
        this.id = ++counterId;
    }

    public int getId() {
        return id;
    }


}
