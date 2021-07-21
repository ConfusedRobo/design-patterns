package demo.strategy;

import strategy.game.controllers.ScoreBoard;
import strategy.game.models.Balloon;
import strategy.game.models.Clown;
import strategy.game.models.SquareBalloon;

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
