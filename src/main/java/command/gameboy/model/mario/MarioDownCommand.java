package command.gameboy.model.mario;

import command.gameboy.interfaces.Command;

public class MarioDownCommand implements Command {
    private final MarioCharacterReceiver receiver;

    public MarioDownCommand(MarioCharacterReceiver receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveDown(); }
}
