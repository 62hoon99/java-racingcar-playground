package racing.domain;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
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

    public List<String> finalResult() {
        Map<String, Integer> resultMap = result();
        Integer max = getMaxSpot(resultMap);
        return getWinners(resultMap, max);
    }

    private List<String> getWinners(Map<String, Integer> resultMap, Integer max) {
        return resultMap.keySet()
                .stream()
                .filter(key -> resultMap.get(key).equals(max))
                .collect(Collectors.toList());
    }

    private Integer getMaxSpot(Map<String, Integer> resultMap) {
        return result().keySet()
                .stream()
                .map(resultMap::get)
                .distinct()
                .max(Integer::compareTo)
                .orElseThrow(RuntimeException::new);
    }
}
