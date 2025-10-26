package racingcar.view;

import camp.nextstep.edu.missionutils.Console;
import racingcar.data.InputData;

public class InputView {

    private static final String CAR_NAME_DELIMITER = ",";

    public static InputData input() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String[] cars = Console.readLine().split(CAR_NAME_DELIMITER);

        for (String car : cars) {
            if (car.length() > 5)
                throw new IllegalArgumentException("자동차 이름(\"" + car + "\")에 대한 형식이 잘못되었습니다.");
        }

        System.out.println("시도할 횟수는 몇 회인가요?");
        String tryCountInput = Console.readLine();
        int tryCount;
        try {
            tryCount = Integer.parseInt(tryCountInput);
            if (tryCount <= 0) {
                throw new IllegalArgumentException("시도할 횟수(\"" + tryCountInput + "\")에 대한 형식이 잘못되었습니다.");
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("시도할 횟수(\"" + tryCountInput + "\")에 대한 형식이 잘못되었습니다.");
        }

        return new InputData(cars, tryCount);
    }

}