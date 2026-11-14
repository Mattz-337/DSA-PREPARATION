package model;

import service.Insurable;

public class Van extends SchoolVehicle implements Insurable {

    public Van(int id, String reg, String driver, int capacity) {
        super(id, reg, driver, capacity);
    }

    @Override
    public double calculateMonthlyFee() {
        return getCapacity() * 600;
    }

    @Override
    public double calculateInsurance() {
        return getCapacity() * 100;
    }

    public void displayVanType() {
        System.out.println("School Van");
    }
}