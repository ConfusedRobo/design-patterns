package command.gameboy.model.kirby;

import command.gameboy.interfaces.Command;

public class KirbyUpCommand implements Command {
    private final KirbyCharacter receiver;

    public KirbyUpCommand(KirbyCharacter receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveUp(); }
}
