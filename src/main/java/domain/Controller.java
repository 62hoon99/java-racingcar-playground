package domain;

import view.InputView;
import view.OutputView;

import java.util.List;
import java.util.Random;

public class Controller {

    private static final Integer RANDOM_BOUND_VALUE = 10;

    private final InputView inputView;
    private final OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        Cars cars = new Cars(inputView.name());
        Round round = new Round(inputView.round());

        int index = 0;
        while(round.isLessThan(index++)) {
            cars.move(() -> new Random().nextInt(RANDOM_BOUND_VALUE));
        }

        outputView.end(cars.winners());
    }
}
