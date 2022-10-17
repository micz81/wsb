package zadanie01;

public class Person {
    String firstName;
    String lastName;

    public String getFullName() {

        if (firstName == "") {
            return lastName;
        } else if (lastName == "") {
            return firstName;
        } else if (firstName == "" && lastName == "") {
            return null;
        } else {
            return firstName + " " + lastName;
        }
    }

    public static Person constructPerson(String firstName, String lastName) {

        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;
        return person;
    }
}