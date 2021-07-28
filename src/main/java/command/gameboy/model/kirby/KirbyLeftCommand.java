package command.gameboy.model.kirby;

import command.gameboy.interfaces.Command;

public class KirbyLeftCommand implements Command {
    private final KirbyCharacterReceiver receiver;

    public KirbyLeftCommand(KirbyCharacterReceiver receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveLeft(); }
}
