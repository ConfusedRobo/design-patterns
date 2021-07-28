package command.gameboy.model.mario;

import command.gameboy.interfaces.Command;

public class MarioUpCommand implements Command {
    private final MarioCharacterReceiver receiver;

    public MarioUpCommand(MarioCharacterReceiver receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveUp(); }
}
