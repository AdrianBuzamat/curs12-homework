package ro.fasttrackit.curs12.homework.ex2;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PersonList personList = new PersonList(List.of(
                new Person("Dragos", 44, "brunet"),
                new Person("Ana", 37, "blond"),
                new Person("Mihaela", 42, "saten"),
                new Person("Marius", 38, "brunet"),
                new Person("Cristi", 38, "blond"),
                new Person("Silviu", 27, "brunet"),
                new Person("Marius", 27, "brunet")));

        System.out.println(personList.personNames());
        System.out.println(personList.mapNameToAge());
        System.out.println(personList.listOfOlderPerson(40));
        System.out.println(personList.personGroupedByHairColor());
        System.out.println(personList.personGroupedByAge());
    }
}
