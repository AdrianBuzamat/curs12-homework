package ro.fasttrackit.curs12.homework.ex3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeesList employees = new EmployeesList(List.of(
                new Employee("Dragos", 44, "brunet", "Dedeman", 3000),
                new Employee("Ana", 37, "saten", "Brico Depot", 3200),
                new Employee("Marius", 38, "brunet", "Leroy Merlin", 2700),
                new Employee("Maria", 22, "blond", "Leroy Merlin", 7000),
                new Employee("Mihaela", 43, "brunet", "Dedeman", 3300),
                new Employee("Sofia", 31, "saten", "Brico Depot", 2000)));

        System.out.println(employees.bestPaidEmployees(3200));
        System.out.println(employees.employeeGroupedByCompany());
        System.out.println(employees.sumOfSalaries());
        System.out.println(employees.bestCompanySalary());
    }
}
