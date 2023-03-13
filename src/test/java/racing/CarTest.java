package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void _4이상이면_움직이고_4보다_작으면_안움직인다() throws Exception {
        //given
        Car car = new Car("grommit");
        //then
        Assertions.assertThat(car.move(4)).isEqualTo(1);
        Assertions.assertThat(car.move(3)).isEqualTo(1);
        Assertions.assertThat(car.move(5)).isEqualTo(2);
    }
}
