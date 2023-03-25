package domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class RoundTest {

    @Test
    public void 라운드는_숫자가_아니면_예외() {
        //then
        assertThatThrownBy(() -> new Round("dadf"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 현재_라운드와_마지막_라운드_비교() {
        //when
        Round five = new Round("5");
        //then
        assertThat(five.isLessThan(4)).isTrue();
        assertThat(five.isLessThan(5)).isFalse();
        assertThat(five.isLessThan(6)).isFalse();
    }
}
