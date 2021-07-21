package strategy.race.models;

import strategy.race.controllers.ScoreAlgorithm;

public class Mercedes implements ScoreAlgorithm {
    private final int topSpeed;
    public final String modelName;

    public Mercedes(int topSpeed, String modelName) {
        this.topSpeed = topSpeed;
        this.modelName = modelName;
    }

    @Override
    public int calculate(int distance) {
        return (distance / topSpeed) + 12;
    }

    @Override
    public String model() {
        return modelName;
    }
}
