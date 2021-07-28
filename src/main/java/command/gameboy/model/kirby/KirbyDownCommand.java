package command.gameboy.model.kirby;

import command.gameboy.interfaces.Command;

public class KirbyDownCommand implements Command {
    private final KirbyCharacter receiver;

    public KirbyDownCommand(KirbyCharacter receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveDown(); }
}
