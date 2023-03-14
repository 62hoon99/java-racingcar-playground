package racing.domain;

public class ValidatorUtils {

    private static final Integer MAX_LENGTH = 5;

    public static void validateLength(String name) {
        if (name.length() > MAX_LENGTH) {
            throw new IllegalArgumentException("자동차 이름이 5자를 초과하였습니다.");
        }
    }
}
