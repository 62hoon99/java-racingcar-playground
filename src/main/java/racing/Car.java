package racing;

public class Car {

    private final String name;

    private Integer spot;

    public Car(String name) {
        this.name = name;
        spot = 0;
    }

    public int move(int num) {
        if (num >= 4) {
            spot++;
        }
        return spot;
    }
}
