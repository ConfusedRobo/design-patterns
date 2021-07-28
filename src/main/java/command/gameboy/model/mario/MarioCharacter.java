package command.gameboy.model.mario;

import static java.lang.System.out;

public class MarioCharacter {
    private final String name;

    public MarioCharacter(String name) { this.name = name; }

    public void moveUp() { out.println(name + " is jumping up!"); }

    public void moveDown() { out.println(name + " is jumping down!"); }

    public void moveLeft() { out.println(name + " is jumping left!"); }

    public void moveRight() { out.println(name + " is jumping right!"); }
}
