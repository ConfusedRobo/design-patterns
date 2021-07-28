package command.technical.models;

import command.technical.interfaces.Command;

public class Invoker {
    private final Command implA;
    private final Command implB;

    public Invoker(Command implA, Command implB) { this.implA = implA; this.implB = implB; }

    public void invokerFunctionA() { implA.execute(); }

    public void invokerFunctionB() { implB.execute(); }
}
