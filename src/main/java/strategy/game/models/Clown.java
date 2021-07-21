package strategy.game.models;

import strategy.game.controllers.ScoreAlgorithmBase;

public class Clown implements ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) - 10;
    }
}
