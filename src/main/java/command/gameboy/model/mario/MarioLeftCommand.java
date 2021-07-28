package command.gameboy.model.mario;

import command.gameboy.interfaces.Command;

public class MarioLeftCommand implements Command {
    private final MarioCharacterReceiver receiver;

    public MarioLeftCommand(MarioCharacterReceiver receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveLeft(); }
}
