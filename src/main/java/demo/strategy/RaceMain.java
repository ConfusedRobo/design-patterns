package demo.strategy;

import strategy.race.controllers.ScoreBoard;
import strategy.race.models.Audi;
import strategy.race.models.BMW;
import strategy.race.models.Mercedes;

import static java.lang.System.out;

public class RaceMain {

    public static void main(String... args) {
        var scoreBoard = new ScoreBoard();
        scoreBoard.algorithm = new Mercedes(234, "CLK-200");
        scoreBoard.showScore(20);
        scoreBoard.algorithm = new BMW(300, "M3-GTR");
        scoreBoard.showScore(20);
        scoreBoard.algorithm = new Audi(250, "R8");
        scoreBoard.showScore(20);

        out.println(scoreBoard.algorithm.model());
        scoreBoard.reset();
    }
}
