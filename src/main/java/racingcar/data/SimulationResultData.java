package racingcar.data;

import java.util.List;
import racingcar.domain.Car;

public class SimulationResultData {
    private final int tryCount;
    private final List<String> winners;
    private final Car[][] record;

    public SimulationResultData(int tryCount, List<String> winners, Car[][] record) {
        this.tryCount = tryCount;
        this.winners = winners;
        this.record = record;
    }

    public String toString() {
        StringBuilder s = new StringBuilder("\n실행 결과\n");
        for (int i = 0; i < tryCount; i++) {
            for (int j = 0; j < record[i].length; j++) {
                s.append(toFormatString(record[i][j]));
            }
            s.append("\n");
        }
        s.append("최종 우승자 : ");
        for (int i = 0; i < winners.size(); i++) {
            s.append(winners.get(i));
            if (i != winners.size() - 1) {
                s.append(", ");
            }
        }
        return s.toString();
    }

    private String toFormatString(Car car) {
        return car.getName() + " : " + "-".repeat(car.getPosition()) + "\n";
    }
}
