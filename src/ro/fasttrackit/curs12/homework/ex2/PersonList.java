package ro.fasttrackit.curs12.homework.ex2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PersonList {
    private final List<Person> personList;

    public PersonList(List<Person> personList) {
        this.personList = personList == null ? new ArrayList<>() : new ArrayList<>(personList);
    }

    public List<String> personNames() {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            result.add(person.getName());
        }
        return result;
    }

    public Map<String, Integer> mapNameToAge() {
        Map<String, Integer> result = new HashMap<>();
        for (Person person : personList) {
            result.put(person.getName(), person.getAge());
        }
        return result;
    }

    public List<String> listOfOlderPerson(int givenAge) {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() > givenAge) {
                result.add(person.getName());
            }
        }
        return result;
    }

    public Map<String, List<String>> personGroupedByHairColor() {
        Map<String, List<String>> result = new HashMap<>();
        for (Person person : personList) {
            result.put(person.getHairColour(), personByHairColor(person.getHairColour()));
        }
        return result;
    }

    public Map<Integer, List<String>> personGroupedByAge() {
        Map<Integer, List<String>> result = new HashMap<>();
        for (Person person : personList) {
            result.put(person.getAge(), personByAge(person.getAge()));
        }
        return result;
    }


    private List<String> personByHairColor(String colour) {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getHairColour().equalsIgnoreCase(colour)) {
                result.add(person.getName());
            }
        }
        return result;
    }

    private List<String> personByAge(int age) {
        List<String> result = new ArrayList<>();
        for (Person person : personList) {
            if (person.getAge() == age) {
                result.add(person.getName());
            }
        }
        return result;
    }
}
