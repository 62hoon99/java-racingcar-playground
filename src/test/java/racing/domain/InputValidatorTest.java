package racing.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class InputValidatorTest {

    @Test
    public void 이름_생성() throws Exception {
        //given
        String input = "david,peter,bab";
        //then
        Assertions.assertThat(InputValidator.validateNameInput(input)).contains("david", "peter", "bab");
    }

    @Test
    public void 이름_5글자_이상_예외_발생() throws Exception {
        //given
        String input = "david,gromit,bab";
        //then
        Assertions.assertThatThrownBy(() -> InputValidator.validateNameInput(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void 라운드_입력값_숫자로_반환() throws Exception {
        //when
        String input = "5";
        //then
        Assertions.assertThat(InputValidator.validateRoundInput(input)).isEqualTo(5);
    }

    @Test
    public void 라운드_입력값_문자일경우_예외_발생() throws Exception {
        //when
        String input = "d";
        //then
        Assertions.assertThatThrownBy(() -> InputValidator.validateRoundInput(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
