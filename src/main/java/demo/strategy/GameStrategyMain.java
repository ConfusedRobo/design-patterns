package demo.strategy;

import strategy.game.controller.ScoreBoard;
import strategy.game.model.Balloon;
import strategy.game.model.Clown;
import strategy.game.model.SquareBalloon;

public class GameStrategyMain {

    public static void main(String... args) {
        var scoreBoard = new ScoreBoard();
        scoreBoard.algorithmBase = new Balloon();
        scoreBoard.showScore(10, 5);
        scoreBoard.algorithmBase = new Clown();
        scoreBoard.showScore(10, 5);
        scoreBoard.algorithmBase = new SquareBalloon();
        scoreBoard.showScore(10, 5);
    }
}
