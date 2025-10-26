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

    public Car[][] getRecord() {
        return record;
    }

    public List<String> getWinners() {
        return winners;
    }

    public int getTryCount() {
        return tryCount;
    }
}
