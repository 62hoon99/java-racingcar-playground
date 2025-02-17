package domain;

import java.util.Objects;

public class Position {

    private final int position;

    public Position(int position) {
        this.position = position;
    }

    public Position moveForward() {
        return new Position(position + 1);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Position position1 = (Position) o;
        return position == position1.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }

    public boolean isLessThan(Position position) {
        return position.isBiggerThan(this.position);
    }

    public boolean isLessThan(int num) {
        return position > num;
    }

    private boolean isBiggerThan(int position) {
        return this.position > position;
    }

}
