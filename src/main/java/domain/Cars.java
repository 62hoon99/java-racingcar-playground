package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cars {

    private final List<Car> cars;

    public Cars(String names) {
        cars = Name.splitNames(names)
                .stream()
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void move(RandomGenerator randomGenerator) {
        for (Car car : cars) {
            car.move(randomGenerator.get());
            System.out.println(car);
        }
        System.out.println();
    }

    public List<String> winners() {
        return getWinners(getMaxPosition());
    }

    private List<String> getWinners(Position maxPosition) {
        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isPosition(maxPosition)) {
                winners.add(car.getName());
            }
        }
        return winners;
    }

    private Position getMaxPosition() {
        Position maxPosition = new Position(0);
        for (Car car : cars) {
            if (car.isBiggerThan(maxPosition)) {
                maxPosition = car.getPosition();
            }
        }
        return maxPosition;
    }
}
