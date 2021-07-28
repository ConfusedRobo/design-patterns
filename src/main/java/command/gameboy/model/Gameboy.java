package command.gameboy.model;

import command.gameboy.interfaces.Command;

public class Gameboy {
    private final Command up;
    private final Command down;
    private final Command left;
    private final Command right;

    public Gameboy(Command up, Command down, Command left, Command right) {
        this.up = up;
        this.down = down;
        this.left = left;
        this.right = right;
    }

    public void arrowUp() { up.execute(); }

    public void arrowDown() { down.execute(); }

    public void arrowLeft() { left.execute(); }

    public void arrowRight() { right.execute(); }
}
