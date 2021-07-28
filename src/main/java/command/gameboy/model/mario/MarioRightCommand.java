package command.gameboy.model.mario;

import command.gameboy.interfaces.Command;

public class MarioRightCommand implements Command {
    private final MarioCharacterReceiver receiver;

    public MarioRightCommand(MarioCharacterReceiver receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveRight(); }
}
