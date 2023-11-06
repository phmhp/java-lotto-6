package lotto;

import view.Instruction;
import controller.Controller;

public class Application {

    public Application(Controller controller) {
    }

    public static void main(String[] args) {
        // TODO: 프로그램 구현
        Controller controller = new Controller();
        controller.game();

    }
}
