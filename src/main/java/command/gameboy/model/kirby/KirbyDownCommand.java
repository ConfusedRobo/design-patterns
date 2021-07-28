package command.gameboy.model.kirby;

import command.gameboy.interfaces.Command;

public class KirbyDownCommand implements Command {
    private final KirbyCharacterReceiver receiver;

    public KirbyDownCommand(KirbyCharacterReceiver receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveDown(); }
}
