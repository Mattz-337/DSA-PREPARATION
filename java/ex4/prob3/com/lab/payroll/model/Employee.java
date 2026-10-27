package com.lab.payroll.model;

public abstract class Employee
        implements Payable, Comparable<Employee> {

    private int id;
    private String name;
    protected double basicPay;

    public Employee(int id, String name, double basicPay) {
        this.id = id;
        this.name = name;
        this.basicPay = basicPay;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBasicPay() {
        return basicPay;
    }

    @Override
    public int compareTo(Employee other) {
        return Integer.compare(this.id, other.id);
    }
}