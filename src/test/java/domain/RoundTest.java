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


}
