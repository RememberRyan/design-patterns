package ee.sda.patterns.creational.builder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.Builder()
                .fullName("John Smith")
                .age(500)

                // adding friends using the chaining style
                .addFriend("Jim Bob")
                .addFriend("Davice Bob")
                .addFriend("Jim Bob")
                .addFriend("Jim Bob")
                .addFriend("Jim Bob")
                .addFriend("Jim Bob")
                .addFriend("Jim Bob")
                .addFriend("Jim Bob")
                .addFriend("Jim Bob")
                .addFriend("Jim Bob")
                .addFriends(Arrays.asList("Mary Lou", "Jennifer Aniston"))
                .addFriends("Mary Kate", "Ashley Simpson", "Jill Scott")

                // build creates the instance of the person
                .build();

        System.out.println(person);
    }
}
