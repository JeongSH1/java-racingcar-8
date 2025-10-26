package racingcar.data;

public class InputData {
    private final String[] cars;
    private final int tryCount;

    public InputData(String[] cars, int tryCount) {
        this.cars = cars;
        this.tryCount = tryCount;
    }

    public String[] getCars() {
        return cars;
    }

    public int getTryCount() {
        return tryCount;
    }
}
