package racingcar;

import racingcar.application.Simulator;
import racingcar.view.InputView;
import racingcar.view.OutputView;

public class Application {
    public static void main(String[] args) {
        OutputView.print(Simulator.simulate(InputView.input()));
    }
}
