package domain;

import view.InputView;

import java.util.List;
import java.util.Random;

public class Controller {

    private static final Integer RANDOM_BOUND_VALUE = 10;

    private final InputView inputView;

    public Controller(InputView inputView) {
        this.inputView = inputView;
    }

    public void start() {
        Cars cars = new Cars(inputView.name());
        Round round = new Round(inputView.round());

    }
}
