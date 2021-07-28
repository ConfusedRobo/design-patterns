package command.gameboy.model.mario;

import command.gameboy.interfaces.Command;

public class MarioDownCommand implements Command {
    private final MarioCharacter receiver;

    public MarioDownCommand(MarioCharacter receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveDown(); }
}
