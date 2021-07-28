package command.technical.models;

import command.technical.interfaces.Command;

public class CommandImplA implements Command {
    private final Receiver receiver;

    public CommandImplA(Receiver receiver) { this.receiver = receiver; }

    @Override
    public void execute() { receiver.receiveA(); }
}
