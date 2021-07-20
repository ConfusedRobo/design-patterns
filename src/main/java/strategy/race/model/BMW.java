package strategy.race.model;

import strategy.race.controller.ScoreBoardAlgorithm;

public class BMW implements ScoreBoardAlgorithm {
    private final int topSpeed;
    public final String modelName;

    public BMW(int topSpeed, String modelName) {
        this.topSpeed = topSpeed;
        this.modelName = modelName;
    }

    @Override
    public int calculate(int distance) {
        return (distance / topSpeed) + 8;
    }

    @Override
    public String model() {
        return modelName;
    }
}
