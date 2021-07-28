package command.gameboy.model.mario;

import command.gameboy.interfaces.Command;

public class MarioUpCommand implements Command {
    private final MarioCharacter receiver;

    public MarioUpCommand(MarioCharacter receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveUp(); }
}
