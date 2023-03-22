package domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Name {

    private static final Integer MAX_LENGTH = 4;
    private final String name;

    public Name(String name) {
        validateLength(name);
        this.name = name;
    }

    private void validateLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("이름은 " + MAX_LENGTH + "보다 길면 안됩니다.");
        }
    }

    public static List<String> splitNames(String names) {
        return Arrays.asList(names.split(","));
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
