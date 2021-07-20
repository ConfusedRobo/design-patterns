package strategy.game.controller;

import static java.lang.System.out;

public class ScoreBoard {
    public ScoreAlgorithmBase algorithmBase;

    public void showScore(int taps, int multiplier) {
        out.println(algorithmBase.calculateScore(taps, multiplier));
    }
}
