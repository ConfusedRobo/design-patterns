package strategy.game.model;

import strategy.game.controller.ScoreAlgorithmBase;

public class SquareBalloon implements ScoreAlgorithmBase {
    @Override
    public int calculateScore(int taps, int multiplier) {
        return (taps * multiplier) + 40;
    }
}
