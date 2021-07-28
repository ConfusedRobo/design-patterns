package demo.command.gameboy;

import command.gameboy.model.Gameboy;
import command.gameboy.model.kirby.*;
import command.gameboy.model.mario.*;

public class GameboyMain {

    public static void main(String... args) {
        var receiverMario = new MarioCharacterReceiver("Mario");
        new MarioUpCommand(receiverMario).execute();
        new MarioDownCommand(receiverMario).execute();
        new MarioLeftCommand(receiverMario).execute();
        new MarioRightCommand(receiverMario).execute();

        var receiverKirby = new KirbyCharacterReceiver("Kirby");
        var upKirby = new KirbyUpCommand(receiverKirby);
        var downKirby = new KirbyDownCommand(receiverKirby);
        var leftKirby = new KirbyLeftCommand(receiverKirby);
        var rightKirby = new KirbyRightCommand(receiverKirby);
        var gameboy = new Gameboy(upKirby, downKirby, leftKirby, rightKirby);

        gameboy.arrowDown();
        gameboy.arrowLeft();
        gameboy.arrowDown();
        gameboy.arrowDown();
        gameboy.arrowRight();
        gameboy.arrowUp();
    }
}
