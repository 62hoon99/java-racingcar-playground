package racing.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racing.domain.ValidatorUtils;

public class ValidatorUtilsTest {

    @Test
    public void 이름이_5자_이상이면_예외() throws Exception {
        //then
        Assertions.assertThatThrownBy(() -> ValidatorUtils.validateLength("wallace"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
