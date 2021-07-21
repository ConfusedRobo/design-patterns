package strategy.race.controllers;

public interface ScoreAlgorithm {
    int calculate(int distance);
    String model();
}
