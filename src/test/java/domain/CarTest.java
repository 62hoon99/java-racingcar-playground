package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void 숫자가_4_이상이면_이동() {
        // given
        Car pobi = new Car("pobi");
        Car crong = new Car("crong");
        // when
        pobi.move(4);
        crong.move(3);
        // then
        Assertions.assertThat(pobi).isEqualTo(new Car("pobi", 1));
        Assertions.assertThat(crong).isEqualTo(new Car("crong", 0));
    }
}
