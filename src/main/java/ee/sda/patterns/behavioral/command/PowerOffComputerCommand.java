package ee.sda.patterns.behavioral.command;

import ee.sda.patterns.behavioral.command.model.Computer;
import ee.sda.patterns.behavioral.command.model.ComputerState;

public class PowerOffComputerCommand extends ComputerCommand {

    public PowerOffComputerCommand(Computer computer){
        super (computer);
    }

    @Override
    public boolean execute() {
        if (computer.getState() == ComputerState.BUSY){
        return false;
        }
        return computer.powerOff();
    }
}
