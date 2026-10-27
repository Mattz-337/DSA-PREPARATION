package com.lab.payroll.model;

public interface Payable {

    double TAX_RATE = 0.10;

    double calculateSalary();

    default double netSalary() {
        return calculateSalary() * (1 - TAX_RATE);
    }

    static double totalPayout(Payable[] list) {
        double total = 0;

        for (Payable p : list) {
            total += p.netSalary();
        }

        return total;
    }
}