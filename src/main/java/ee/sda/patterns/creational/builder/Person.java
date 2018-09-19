package ee.sda.patterns.creational.builder;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    // default constructor now being private.
    // users ONLY using Builder for creating instances of person. We mark default constructor as 'private' to enforce this
    private Person() {

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

    // inner classes
    // creating an object with additional logic
    public static class Builder {

        // we copy the attributes to the builder
        private String firstName;
        private String lastName;
        private int age;


        // create setters for these properties.
        // instead it returns same type instead of void
        public Builder fullName(String fullName){
            //this.firstName = firstName;
            //return this;
            String[] nameParts=fullName.split("\\s");
            this.firstName = nameParts[0];
            this.lastName = nameParts[1];
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }


        // return instance of a person
        public Person build() {
            // how the person should be created
            Person person = new Person();
            person.lastName = this.lastName;
            person.firstName = this.firstName;
            person.age = this.age;
            return person;
        }


    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }
}
