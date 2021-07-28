package demo.command.technical;

import command.technical.models.CommandImplA;
import command.technical.models.CommandImplB;
import command.technical.models.Invoker;
import command.technical.models.Receiver;

public class TechnicalMain {

    public static void main(String... args) {
        var receiver = new Receiver("Receiver");
        var commandA = new CommandImplA(receiver);
        var commandB = new CommandImplB(receiver);
        var invoker = new Invoker(commandA, commandB);

        invoker.invokerFunctionA();
        invoker.invokerFunctionA();
        invoker.invokerFunctionB();
        invoker.invokerFunctionB();
        invoker.invokerFunctionA();
    }
}
