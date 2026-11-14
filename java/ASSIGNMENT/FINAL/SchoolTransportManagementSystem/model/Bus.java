package model;

import service.Insurable;

public class Bus extends SchoolVehicle implements Insurable {

    public Bus(int id, String reg, String driver, int capacity) {
        super(id, reg, driver, capacity);
    }

    @Override
    public double calculateMonthlyFee() {
        return getCapacity() * 800;
    }

    @Override
    public double calculateInsurance() {
        return getCapacity() * 200;
    }

    public void displayBusType() {
        System.out.println("School Bus");
    }
}