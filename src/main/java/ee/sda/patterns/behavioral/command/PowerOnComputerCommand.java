package ee.sda.patterns.behavioral.command;
import ee.sda.patterns.behavioral.command.model.Computer;
public class PowerOnComputerCommand extends ComputerCommand {
    public PowerOnComputerCommand(Computer computer) {
        super(computer);
    }
    @Override
    public boolean execute() {
        return computer.powerOn();
    }
}