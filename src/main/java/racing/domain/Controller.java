package racing.domain;

import racing.view.InputView;
import racing.view.OutputView;

import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Controller {

    private final InputView inputView;

    private final OutputView outputView;

    public Controller(InputView inputView, OutputView outputView) {
        this.inputView = inputView;
        this.outputView = outputView;
    }

    public void start() {
        String nameInput = inputView.name();
        List<String> names = InputValidator.validateNameInput(nameInput);
        Integer round = InputValidator.validateRoundInput(inputView.round());

        Cars cars = new Cars(names);

        playRacing(names, cars, round);
    }

    private void playRacing(List<String> names, Cars cars, Integer round) {
        IntStream.range(0, round)
                .forEach(i -> {
                    moveCars(names, cars);
                    outputView.result(cars.result());
                });

        end(cars);
    }

    private void moveCars(List<String> names, Cars cars) {
        for (String name : names) {
            cars.move(name, RandomValueGenerator.generate());
        }
    }

    private void end(Cars cars) {
        List<String> names = cars.finalResult();
        outputView.end(names);
    }
}
