package racing.domain;

public class Car {

    private Integer spot;

    public Car() {
        spot = 0;
    }

    public void move(int num) {
        if (num >= 4) {
            spot++;
        }
    }

    public Integer currentSpot() {
        return spot;
    }
}
