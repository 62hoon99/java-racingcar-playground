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
    public void 라운드를_모두_진행하면_우승자를_반환한다() {
        //given
        Cars cars = new Cars("pobi,crong,honux");
        Round round = new Round("5");
        //when
        List<String> winners = round.start(cars, () -> 4);
        //then
        assertThat(winners).contains("pobi", "crong", "honux");

    }
}
