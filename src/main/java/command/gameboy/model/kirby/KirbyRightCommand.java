package command.gameboy.model.kirby;

import command.gameboy.interfaces.Command;

public class KirbyRightCommand implements Command {
    private final KirbyCharacter receiver;

    public KirbyRightCommand(KirbyCharacter receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveRight(); }
}
