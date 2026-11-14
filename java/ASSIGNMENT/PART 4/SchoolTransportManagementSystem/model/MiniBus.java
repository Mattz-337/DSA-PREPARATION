package model;

import service.Insurable;

public class MiniBus extends SchoolVehicle implements Insurable {

    public MiniBus(int id, String reg, String driver, int capacity) {
        super(id, reg, driver, capacity);
    }

    @Override
    public double calculateMonthlyFee() {
        return getCapacity() * 700;
    }

    public double calculateInsurance() {
        return getCapacity() * 150;
    }
}