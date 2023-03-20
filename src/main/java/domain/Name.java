package domain;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Name {

    private final String name;

    public Name(String name) {
        this.name = name;
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
