package ee.sda.patterns.behavioral.command;

import ee.sda.patterns.behavioral.command.model.Computer;

public abstract class ComputerCommand {

    protected Computer computer;

    public ComputerCommand(Computer computer) {
        this.computer = computer;
    }

    public abstract boolean execute();
}
