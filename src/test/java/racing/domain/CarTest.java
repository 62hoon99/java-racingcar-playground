package racing.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void _4이상이면_움직이고_4보다_작으면_안움직인다() throws Exception {
        //given
        Car car = new Car();
        //then
        car.move(4);
        Assertions.assertThat(car.currentSpot()).isEqualTo(1);

        car.move(3);
        Assertions.assertThat(car.currentSpot()).isEqualTo(1);

        car.move(5);
        Assertions.assertThat(car.currentSpot()).isEqualTo(2);
    }
}
