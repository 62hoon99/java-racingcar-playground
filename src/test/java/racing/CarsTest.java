package racing;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

public class CarsTest {

    @Test
    public void 결과_반환() throws Exception {
        //given
        Cars cars = new Cars(Arrays.asList("gromit", "wallace", "penguin"));
        //when
        cars.move("gromit", 4);
        cars.move("wallace", 3);
        cars.move("penguin", 0);
        //then
        Map<String, Integer> report = cars.result();
        Assertions.assertThat(report.get("gromit")).isEqualTo(1);
        Assertions.assertThat(report.get("wallace")).isEqualTo(0);
        Assertions.assertThat(report.get("penguin")).isEqualTo(0);
    }
}
