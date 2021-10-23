package com.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        employees.add(new Developer("John", "Doe", 30, 7, true));
        employees.add(new Intern("Meryl", "Streep", 25, 1, false));
        employees.add(new TeamLead("Miranda", "Priestly", 45, 20, true));

        employees.forEach(System.out::println);
        System.out.println("\n\n\n");

        List<Employee> employeeList = new ArrayList<>(employees);
        employeeList.forEach(System.out::println);
    }
}
