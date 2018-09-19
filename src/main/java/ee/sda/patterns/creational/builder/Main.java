package ee.sda.patterns.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .fullName("John Smith")
                .age(500)
                // build creates the instance of the person
                .build();

        System.out.println(person);
    }
}
