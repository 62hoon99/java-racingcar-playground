package racing;

import racing.domain.Controller;
import racing.view.InputView;
import racing.view.OutputView;

public class RacingApp {

    public static void main(String[] args) {
        Controller controller = new Controller(new InputView(), new OutputView());
        controller.start();
    }
}
