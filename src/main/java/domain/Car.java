package domain;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Car {
    private static final Integer MINIMUM_MOVABLE_VALUE = 4;

    private final Name name;
    private Position position;

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public void move(int i) {
        if (i >= MINIMUM_MOVABLE_VALUE) {
            this.position = position.moveForward();
        }
    }

    public Position getPosition() {
        return this.position;
    }

    public boolean isPosition(Position position) {
        return this.position.equals(position);
    }

    public String getName() {
        return this.name.toString();
    }

    public boolean isBiggerThan(Position position) {
        if (position.isLessThan(this.position)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder(name + " : ");

        int i = 0;
        while (position.isLessThan(i++)) {
            str.append("-");
        }

        return str.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(name, car.name) && Objects.equals(position, car.position);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position);
    }
}
