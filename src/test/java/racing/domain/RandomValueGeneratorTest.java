package racing.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomValueGeneratorTest {

    @Test
    public void 랜덤_숫자_생성() throws Exception {
        //then
        Assertions.assertThat(RandomValueGenerator.generate()).isBetween(0, 10);
    }
}
