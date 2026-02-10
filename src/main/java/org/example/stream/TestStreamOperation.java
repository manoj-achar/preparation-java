package org.example.stream;

import java.util.*;
import java.util.stream.Collectors;

public class TestStreamOperation {
    public static List<Employee> getEmployeeList() {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee("Rahul", "HR", 120, 25));
        empList.add(new Employee("Ravi", "IT", 125, 26));
        empList.add(new Employee("Asha", "HR", 200, 27));
        empList.add(new Employee("Kamat", "IT", 150, 28));
        empList.add(new Employee("Shilpa", "DEVELOP", 275, 26));
        empList.add(new Employee("Suraj", "DEVELOP", 80, 28));
        return empList;
    }

    static void main() {
        List<Employee> inputList = getEmployeeList();
        //Sort based on salary
        List<Employee> sortedList = inputList.stream().sorted(Comparator.comparingInt(Employee::getAge)).toList();
        System.out.println("\nSorted based on salary");
        sortedList.forEach(System.out::println);
        //List of highest earning employees in each department
        Map<String, Optional<Employee>> highestEmployeePerDepartment = inputList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))));
        List<Employee> highestEarningEmployees = highestEmployeePerDepartment.values().stream().map(employee -> employee.orElse(null)).toList();
        System.out.println("\nList of highest earning employees in each department");
        highestEarningEmployees.forEach(System.out::println);
    }
}
