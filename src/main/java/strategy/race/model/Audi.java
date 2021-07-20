package strategy.race.model;

import strategy.race.controller.ScoreBoardAlgorithm;

public class Audi implements ScoreBoardAlgorithm {
    private final int topSpeed;
    public final String modelName;

    public Audi(int topSpeed, String modelName) {
        this.topSpeed = topSpeed;
        this.modelName = modelName;
    }

    @Override
    public int calculate(int distance) {
        return (distance / topSpeed) + 10;
    }

    @Override
    public String model() {
        return modelName;
    }
}
