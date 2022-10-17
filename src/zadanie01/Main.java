package zadanie01;

import static zadanie01.Person.constructPerson;

public class Main {
    public static void main(String[] args) {

        Person[] people = {
                constructPerson("Michal", "Zaborski"),
                constructPerson("John", "Doe"),
                constructPerson("Bob", "Doe"),
                constructPerson("James", ""),
                constructPerson("", "NoName")};

        familyMembers("Doe", people);
        familyMembers("NotOnList", people);
        familyMembers("", people);
        familyMembers("NoName", people);
    }

    public static void familyMembers(String lastName, Person[] people) {
        String members = "";
        boolean addComma = false;
        for (Person person : people) {
            if (person.lastName == lastName) {
                if (addComma) {
                    members += ", ";
                }
                members += person.getFullName();
                addComma = true;
            }
        }

        if (members == "") {
            System.out.printf("Family members of house %s: No family members\n", lastName);
        } else {
            System.out.printf("Family members of house %s: %s\n", lastName, members);
        }
    }
}