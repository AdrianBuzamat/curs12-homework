package ro.fasttrackit.curs12.homework.ex1;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        final Map<String, Integer> studentMap = new HashMap<>();
        studentMap.put("Dragos", 10);
        studentMap.put("Ana", 9);
        studentMap.put("Maria", 8);
        studentMap.put("Mihaela", 7);
        studentMap.put("Marius", 9);
        studentMap.put("Sofia", 10);

        printStudentsAndTheirGrades(studentMap);
        System.out.println("-------------------------");
        findStudentHighGrade(studentMap);


    }

    public static void printStudentsAndTheirGrades(Map<String, Integer> studentMap) {
        for (String studentName : studentMap.keySet()) {
            System.out.println(studentName + " = " + studentMap.get(studentName));
        }
    }

    public static void findStudentHighGrade(Map<String, Integer> studentMap) {
        List<Student> studentsList = new ArrayList<>();
        for (String studentName : studentMap.keySet()) {
            studentsList.add(new Student(studentName, studentMap.get(studentName)));
        }
        Student student=null;
        for (Student person : studentsList) {
            if (student == null || person.grade() > student.grade()) {
                student = person;
            }
        }
        System.out.println(student);
    }

}
