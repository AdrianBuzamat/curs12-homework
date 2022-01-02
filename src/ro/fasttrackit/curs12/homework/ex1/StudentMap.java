package ro.fasttrackit.curs12.homework.ex1;

import java.util.*;

public class StudentMap {
    private final Map<String, Integer> students;

    public StudentMap(List<Student> students) {
        this.students = new HashMap<>();
        for (Student student : students) {
            this.students.put(student.name(), student.grade());
        }
    }

    public void printStudentsAndTheirGrades() {
        for (String studentName : students.keySet()) {
            System.out.println(studentName + " = " + students.get(studentName));
        }
    }

    public Student findStudentHighGrade() {
        List<Student> studentsList = new ArrayList<>();
        for (String studentName : students.keySet()) {
            studentsList.add(new Student(studentName, students.get(studentName)));
        }
        Student student = null;
        for (Student person : studentsList) {
            if (student == null || person.grade() > student.grade()) {
                student = person;
            }
        }
        return student;
    }

}
