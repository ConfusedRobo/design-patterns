package command.technical.models;

import static java.lang.System.out;

public class Receiver {
    private final String name;

    public Receiver(String name) { this.name = name; }

    public void receiveA() { out.println(name + ": A function"); }

    public void receiveB() { out.println(name + ": A diff. function"); }
}
