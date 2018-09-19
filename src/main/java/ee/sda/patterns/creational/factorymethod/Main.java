package ee.sda.patterns.creational.factorymethod;

public class Main {
    public static void main(String[] args) {
        Integer integer = Integer.valueOf("100");
        String string = String.valueOf(100);

        /*
        A better example fo the factory method using "Computer Type"
        A user chooses or types something how they want and the factory method forces it to be the value of
        what we want it to be.
         */

        ComputerType pc = ComputerType.of("Personal Computer");
        // print the value of the numeration, converting the input, using the factory method
        System.out.println(pc.name());
    }
}
