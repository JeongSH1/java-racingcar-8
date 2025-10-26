package racingcar.application;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;
import racingcar.data.InputData;
import racingcar.data.SimulationResultData;
import racingcar.domain.Car;

public class Simulator {

    public static SimulationResultData simulate(InputData inputData) {

        List<String> winners = new ArrayList<>();
        Car[][] record = new Car[inputData.getTryCount()][inputData.getCars().length];
        Car[] cars = init(inputData);

        for (int i = 0; i < inputData.getTryCount(); i++) {
            moveCars(cars);
            System.arraycopy(cars, 0, record[i], 0, cars.length);
        }

        return new SimulationResultData(inputData.getTryCount(), winners, record);
    }

    private static Car[] init(InputData inputData) {
        Car[] cars = new Car[inputData.getCars().length];
        for (int i = 0; i < cars.length; i++) {
            cars[i] = new Car(inputData.getCars()[i]);
        }
        return cars;
    }


    private static void moveCars(Car[] cars) {
        for (Car car : cars) {
            int randomNumber = Randoms.pickNumberInRange(0, 9);
            if (randomNumber >= 4) {
                car.setPosition(car.getPosition() + 1);
            }
        }
    }
}
