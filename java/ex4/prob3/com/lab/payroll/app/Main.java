package com.lab.payroll.app;

import java.util.Arrays;

import com.lab.payroll.model.*;
import com.lab.payroll.util.*;

public class Main {

    public static void main(String[] args) {

        Employee[] employees = {
            new PermanentEmployee(101, "Anitha", 25000),
            new ContractEmployee(102, "Karthik", 100, 200),
            new PermanentEmployee(103, "Priya", 30000),
            new ContractEmployee(104, "Rahul", 120, 250),
            new PermanentEmployee(105, "Divya", 20000)
        };

        // Sort by ID
        Employee[] byId = Arrays.copyOf(
            employees, employees.length
        );

        Arrays.sort(byId);

        System.out.println("--- Sorted by ID ---");
        PayrollPrinter.print(byId);

        // Sort by net salary, high to low
        Employee[] bySalary = Arrays.copyOf(
            employees, employees.length
        );

        Arrays.sort(bySalary, new SalaryComparator());

        System.out.println("--- Sorted by Salary (high to low) ---");
        PayrollPrinter.print(bySalary);

        // Sort by name
        Employee[] byName = Arrays.copyOf(
            employees, employees.length
        );

        Arrays.sort(byName, new NameComparator());

        System.out.println("--- Sorted by Name ---");
        PayrollPrinter.print(byName);

        // Calculate total payout
        Payable[] payableList = employees;

        System.out.println(
            "Total payout = " + Payable.totalPayout(payableList)
        );

        // Uncomment to observe the compile-time access error:
        // System.out.println(employees[0].basicPay);
    }
}