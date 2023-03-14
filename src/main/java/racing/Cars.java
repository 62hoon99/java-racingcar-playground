package racing;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Cars {

    private final Map<String, Car> racer;

    public Cars(List<String> names) {
        racer = names.stream()
                .collect(Collectors.toMap(name -> name, name -> new Car()));
    }

    public void move(String name, int num) {
        racer.get(name)
                .move(num);
    }

    public Map<String, Integer> result() {
        return racer.keySet()
                .stream()
                .collect(Collectors.toMap(key -> key, key -> racer.get(key).currentSpot()));
    }
}
