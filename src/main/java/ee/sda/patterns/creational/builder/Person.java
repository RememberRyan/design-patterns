package ee.sda.patterns.creational.builder;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // constructor: ugly implementation for large fields. Not very usable
    // ie.
    // new Person("John Smith", 500, false, false, true....)
    public Person(String fullName, int age) {
        String[] nameParts=fullName.split("\\s");
        this.firstName = nameParts[0];
        this.lastName = nameParts[1];
    }

    // immutable - using getters only
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }


}
