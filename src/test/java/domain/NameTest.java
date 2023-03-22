package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class NameTest {

    @Test
    public void 이름이_5자_이상이면_예외_발생() {
        //then
        Assertions.assertThatThrownBy(() -> new Name("gromit"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
