package racing.domain;

import java.util.Arrays;
import java.util.List;

public class InputValidator {

    public static List<String> validateNameInput(String input) {
        ValidatorUtils.validateLength(input);
        return Arrays.asList(input.split(","));
    }
}
