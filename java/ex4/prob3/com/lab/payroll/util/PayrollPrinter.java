package com.lab.payroll.util;

import com.lab.payroll.model.Employee;

public class PayrollPrinter {

    public static void print(Employee[] list) {

        System.out.printf(
            "%-8s %-15s %-18s %-12s%n",
            "ID", "Name", "Employee Type", "Net Salary"
        );

        for (Employee e : list) {

            String type;

            if (e instanceof PermanentEmployee) {
                type = "Permanent";
            } else {
                type = "Contract";
            }

            System.out.printf(
                "%-8d %-15s %-18s %-12.2f%n",
                e.getId(),
                e.getName(),
                type,
                e.netSalary()
            );
        }

        System.out.println();
    }
}