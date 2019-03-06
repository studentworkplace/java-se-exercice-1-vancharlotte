package exercice1.chocolate;

public class Mars {

    private int id;
    private static int counterId = 0;

    public void increaseId(){
        id = counterId++;
    }

    public int getId() {
        this.increaseId();
        return id;
    }


}
