package racing.domain;

import java.util.Random;

public class RandomValueGenerator {

    private static final Random random = new Random();
    public static Integer generate() {
        return random.nextInt(10);
    }
}
