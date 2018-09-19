package ee.sda.patterns.creational.factorymethod;

import java.util.Arrays;

public enum ComputerType {

    PC("Personal Computer"),
    MAC("Computer from Apple");

    private String humanReadableValue;

    ComputerType(String s) {
        this.humanReadableValue = s;
    }

    @Override
    public String toString() {
        return "ComputerType{" +
                "humanReadableValue='" + humanReadableValue + '\'' +
                '}';
    }

    // factory method pattern
    public static ComputerType of(final String humanReadableValue) {
        return Arrays.stream(values())
                .filter(computerType -> computerType.humanReadableValue.equals(humanReadableValue))
                .findFirst().get();
    }
}
