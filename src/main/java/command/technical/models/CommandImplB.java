package command.technical.models;

import command.technical.interfaces.Command;

public class CommandImplB implements Command {
    private final Receiver receiver;

    public CommandImplB(Receiver receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.receiveB(); }
}
