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
        cars.forEach(car -> car.move(randomGenerator.get()));
    }

    public List<String> winners() {

        Position maxPosition = new Position(0);
        for (Car car : cars) {
            Position position = car.getPosition();

            if (maxPosition.isLessThan(car.getPosition())) {
                maxPosition = position;
            }
        }

        List<String> winners = new ArrayList<>();
        for (Car car : cars) {
            if (car.isPosition(maxPosition)) {
                winners.add(car.getName());
            }
        }

        return winners;
    }
}
