package ro.fasttrackit.curs12.homework.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList();
        personList.add(new Person("Dragos", 44, "brunet"));
        personList.add(new Person("Ana", 37, "blond"));
        personList.add(new Person("Mihaela", 42, "saten"));
        personList.add(new Person("Marius", 38, "brunet"));
        personList.add(new Person("Cristi", 38, "blond"));
        personList.add(new Person("Silviu", 27, "brunet"));
        personList.add(new Person("Marius", 27, "brunet"));

        System.out.println(personNames(personList));
        System.out.println(mapNameToAge(personList));
        System.out.println(listOfOlderPerson(personList, 40));
        System.out.println(personGroupedByHairColor(personList));
        System.out.println(personGroupedByAge(personList));

    }

    public static ArrayList<String> personNames(List<Person> personList) {
        ArrayList<String> result = new ArrayList<>();
        for (Person person : personList) {
            result.add(person.getName());
        }
        return result;
    }

    public static Map<String, Integer> mapNameToAge(List<Person> personList) {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : personList) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public static ArrayList<String> listOfOlderPerson(List<Person> personList, int givenAge) {
        ArrayList<String> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > givenAge) {
                result.add(person.getName());
            }
        }
        return result;
    }

    public static Map<String, List<String>> personGroupedByHairColor(List<Person> personList) {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : personList) {
            result.put(person.getHairColour(), personByHairColor(personList, person.getHairColour()));
        }
        return result;
    }

    public static Map<Integer, List<String>> personGroupedByAge(List<Person> personList) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Person person : personList) {
            result.put(person.getAge(), personByAge(personList, person.getAge()));
        }
        return result;
    }


    public static List<String> personByHairColor(List<Person> personList, String colour) {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getHairColour().equalsIgnoreCase(colour)) {
                result.add(person.getName());
            }
        }
        return result;
    }

    public static List<String> personByAge(List<Person> personList, int age) {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() == age) {
                result.add(person.getName());
            }
        }
        return result;
    }

}
