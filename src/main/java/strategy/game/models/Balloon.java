package strategy.game.models;

import strategy.game.controllers.ScoreAlgorithmBase;

public class Balloon implements ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 20;
    }
}
