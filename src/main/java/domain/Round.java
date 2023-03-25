package domain;

import java.util.List;

public class Round {

    private final Integer round;

    public Round(String round) {
        try {
            this.round = Integer.parseInt(round);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("라운드 입력은 숫자만 가능합니다.");
        }
    }

}
