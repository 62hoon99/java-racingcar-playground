import domain.Controller;
import view.InputView;
import view.OutputView;

public class RacingApp {

    public static void main(String[] args) {
        Controller controller = new Controller(new InputView(), new OutputView());
        controller.start();
    }
}
