package racing.domain;

import java.util.Arrays;
import java.util.List;

public class InputValidator {

    public static List<String> validateNameInput(String input) {
        List<String> names = Arrays.asList(input.split(","));
        names.forEach(ValidatorUtils::validateLength);
        return names;
    }
}
