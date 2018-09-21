package ee.sda.patterns.behavioral.command.model;

public class Computer {

    private ComputerState state;

    public Computer() {
        this.state = ComputerState.OFF;
    }

    public boolean powerOn(){
        this.state = ComputerState.ON;
        return true;
    }

    public ComputerState getState() {
        return state;
    }

    public boolean powerOff(){

        this.state = ComputerState.OFF;
        return true;
    }

    public boolean doCalculation(String expression) {
        this.state =ComputerState.BUSY;
        calculate(expression);
        this.state = ComputerState.ON;
        return true;
    }

    private void calculate (String expression) {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}
