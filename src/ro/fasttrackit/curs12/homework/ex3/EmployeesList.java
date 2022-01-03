package ro.fasttrackit.curs12.homework.ex3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeesList {
    private final List<Employee> employees;

    public EmployeesList(List<Employee> employees) {
        this.employees = employees == null ?
                new ArrayList<>() :
                new ArrayList<>(employees);
    }

    public List<String> bestPaidEmployees(int mediumSalary) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getSalary() > mediumSalary) {
                result.add(employee.getName());
            }
        }
        return result;
    }

    public Map<String, List<String>> employeeGroupedByCompany() {
        Map<String, List<String>> result = new HashMap<>();
        for (Employee employee : employees) {
            result.put(employee.getCompany(), namesByCompany(employee.getCompany()));
        }
        return result;
    }

    public int sumOfSalaries() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public String bestCompanySalary() {
        String result = "";
        int highestSalary = 0;
        for (Employee employee : employees) {
            while (highestSalary < employee.getSalary()) {
                highestSalary = employee.getSalary();
                result = employee.getCompany();
            }
        }
        return result;
    }


    private List<String> namesByCompany(String company) {
        List<String> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getCompany().equalsIgnoreCase(company)) {
                result.add(employee.getName());
            }
        }
        return result;
    }
}
