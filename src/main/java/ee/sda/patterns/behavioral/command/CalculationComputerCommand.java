package ee.sda.patterns.behavioral.command;

import ee.sda.patterns.behavioral.command.model.Computer;
import ee.sda.patterns.behavioral.command.model.ComputerState;

public class CalculationComputerCommand extends ComputerCommand {

    private String expression;

    public CalculationComputerCommand(Computer computer, String expression){
        super(computer);
        this.expression = expression;
    }

    @Override
    public boolean execute() {
        if (computer.getState() != ComputerState.ON){
            return false;
        }
        return computer.doCalculation(expression);
    }
}
