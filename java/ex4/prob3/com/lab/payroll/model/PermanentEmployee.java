package com.lab.payroll.model;

public class PermanentEmployee extends Employee {

    public PermanentEmployee(int id, String name, double basicPay) {
        super(id, name, basicPay);
    }

    @Override
    public double calculateSalary() {
        return basicPay + basicPay * 0.40;
    }
}