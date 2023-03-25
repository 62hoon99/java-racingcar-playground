package domain;

import view.InputView;

public class Controller {

    private final InputView inputView;

    public Controller(InputView inputView) {
        this.inputView = inputView;
    }

    public void start() {
        Cars cars = new Cars(inputView.name());
        Round round = new Round(inputView.round());
    }
}
