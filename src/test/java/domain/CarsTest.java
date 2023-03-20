package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class CarsTest {

    @Test
    public void 자동차들을_이동시킨다() {
        //given
        Cars cars = new Cars("pobi,crong,honux");
        //when
//        cars.move(() -> new Random().nextInt(10));
        cars.move(() -> 4);
        //then
        Assertions.assertThat(cars.winners()).contains("pobi", "crong", "honux");
    }
}
