package ro.fasttrackit.curs12.homework.ex1;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentMap studentMap = new StudentMap(
                List.of(new Student("Florin", 7),
                        new Student("Adina", 6),
                        new Student("Dragos", 10),
                        new Student("Maria", 8),
                        new Student("Mihaela", 7),
                        new Student("Marius", 9),
                        new Student("Sofia", 10)));

        studentMap.printStudentsAndTheirGrades();
        System.out.println(studentMap.findStudentHighGrade());
    }
}
