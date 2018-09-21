package ee.sda.patterns.behavioral.command;

import ee.sda.patterns.behavioral.command.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();

        PowerOnComputerCommand powerOnComputerCommand = new PowerOnComputerCommand(computer);
        CalculationComputerCommand calculationComputerCommand
                = new CalculationComputerCommand(computer, "1+1");
        PowerOffComputerCommand powerOffComputerCommand = new PowerOffComputerCommand(computer);

        System.out.println(computer.getState());

        powerOnComputerCommand.execute();
        System.out.println(computer.getState());

        calculationComputerCommand.execute();
        System.out.println(computer.getState());

        powerOffComputerCommand.execute();
        System.out.println(computer.getState());


    }
}
