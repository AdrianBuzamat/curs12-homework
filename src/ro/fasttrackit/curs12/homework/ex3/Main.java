package ro.fasttrackit.curs12.homework.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Dragos", 44, "brunet", "Dedeman", 3000));
        employees.add(new Employee("Ana", 37, "saten", "Brico Depot", 3200));
        employees.add(new Employee("Marius", 38, "brunet", "Leroy Merlin", 2700));
        employees.add(new Employee("Maria", 22, "blond", "Leroy Merlin", 7000));
        employees.add(new Employee("Mihaela", 43, "brunet", "Dedeman", 3300));
        employees.add(new Employee("Sofia", 31, "saten", "Brico Depot", 2000));


        System.out.println("Best paid employees are: " + bestPaidEmployees(employees, 3200));
        System.out.println("All employees grouped by Companies are: " + employeeGroupedByCompany(employees));
        System.out.println("Sum of all salaries is: " + sumOfSalaries(employees));
        System.out.println(bestCompanySalary(employees));


    }

    public static List<String> bestPaidEmployees(List<Employee> employees, int mediumSalary) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > mediumSalary) {
                result.add(employee.getName());
            }
        }
        return result;
    }

    public static Map<String, List<String>> employeeGroupedByCompany(List<Employee> employees) {
        Map<String, List<String>> result = new HashMap<>();
        for (Employee employee : employees) {
            result.put(employee.getCompany(), namesByCompany(employees, employee.getCompany()));
        }
        return result;
    }

    public static int sumOfSalaries(List<Employee> employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static String bestCompanySalary(List<Employee> employees) {
        String result = "";
        int highestSalary = 0;
        for (Employee employee : employees) {
            while (highestSalary < employee.getSalary()) {
                highestSalary = employee.getSalary();
                result = employee.getCompany();
            }
        }
        return "Company with highest salary is: " + result;
    }


    public static List<String> namesByCompany(List<Employee> employees, String company) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getCompany().equalsIgnoreCase(company)) {
                result.add(employee.getName());
            }
        }
        return result;
    }
}
