package com.lab.payroll.model;

public class ContractEmployee extends Employee {

    private double hoursWorked;
    private double hourlyRate;

    public ContractEmployee(
            int id, String name,
            double hoursWorked, double hourlyRate) {

        super(id, name, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }
}