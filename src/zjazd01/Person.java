package zjazd01;

class Person {
    String firstName;
    String lastName;

    public static String getFullName(Person person) {

        if (person.firstName == "") {
            return person.lastName;
        }
        else if (person.lastName == "") {
            return person.firstName;
        } else {
            return person.firstName + " " + person.lastName;
        }
    }

    public static Person constructPerson(String firstName, String lastName) {

        Person person = new Person();
        person.firstName = firstName;
        person.lastName = lastName;
        return person;
    }

    public static void main(String[] args) {
        Person[] people = {constructPerson("Michal", "Zaborski"), constructPerson("John", "Doe"), constructPerson("Bob", "Doe"), constructPerson("James", ""), constructPerson("", "NoName")};
        familyMembers("Doe", people);
    }

    public static void familyMembers(String lastName, Person[] people) {
        for (Person person: people) {
            if (person.lastName == lastName) {
                System.out.println(getFullName(person));
            }
        }
    }
}


