package command.gameboy.model.kirby;

import command.gameboy.interfaces.Command;

public class KirbyLeftCommand implements Command {
    private final KirbyCharacter receiver;

    public KirbyLeftCommand(KirbyCharacter receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.moveLeft(); }
}
