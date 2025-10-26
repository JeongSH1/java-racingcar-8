package racingcar.application;

import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import racingcar.data.InputData;
import racingcar.data.SimulationResultData;
import racingcar.domain.Car;

public class Simulator {

    public static SimulationResultData simulate(InputData inputData) {
        Car[][] record = new Car[inputData.getTryCount()][inputData.getCars().length];
        Car[] cars = init(inputData);

        for (int i = 0; i < inputData.getTryCount(); i++) {
            moveCars(cars);
            record[i] = Arrays.stream(cars)
                    .map(Car::copy)
                    .toArray(Car[]::new);
        }

        return new SimulationResultData(inputData.getTryCount(), findWinners(cars), record);
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

    private static List<String> findWinners(Car[] cars) {
        List<String> winners = new ArrayList<>();
        int maxPosition = -1;
        for (Car car : cars) {
            if (car.getPosition() > maxPosition) {
                maxPosition = car.getPosition();
            }
        }
        for (Car car : cars) {
            if (car.getPosition() == maxPosition) {
                winners.add(car.getName());
            }
        }
        return winners;
    }
}
