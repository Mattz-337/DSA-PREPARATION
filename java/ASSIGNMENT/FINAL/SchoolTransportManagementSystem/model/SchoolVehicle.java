package model;

import service.CapacityExceededException;

public class SchoolVehicle {

    private int vehicleId;
    private String registrationNumber;
    private String driverName;
    private int capacity;

    private static int vehicleCount = 0;

    // Default constructor
    public SchoolVehicle() {
        this(0, "Not Assigned", "Not Assigned", 0);
    }

    // Parameterised constructor
    public SchoolVehicle(int id, String reg,
                         String driver, int capacity) {

        this.vehicleId = id;
        this.registrationNumber = reg;
        this.driverName = driver;
        this.capacity = capacity;
        vehicleCount++;
    }

    // Getters
    public int getVehicleId() {
        return vehicleId;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public int getCapacity() {
        return capacity;
    }

    // Setters
    public void setVehicleId(int id) {
        this.vehicleId = id;
    }

    public void setRegistrationNumber(String reg) {
        this.registrationNumber = reg;
    }

    public void setDriverName(String driver) {
        this.driverName = driver;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public static int getVehicleCount() {
        return vehicleCount;
    }

    // Overloaded methods
    public double calculateMonthlyFee() {
        return capacity * 500;
    }

    public double calculateMonthlyFee(double discount) {
        double fee = calculateMonthlyFee();
        return fee - (fee * discount / 100);
    }

    // Passenger allocation
    public void assignPassengers(int passengers)
            throws CapacityExceededException {

        if (passengers > capacity) {
            throw new CapacityExceededException(
                "Passenger count exceeds vehicle capacity!"
            );
        }

        System.out.println(passengers +
                           " passengers assigned successfully.");
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId +
               "\nRegistration: " + registrationNumber +
               "\nDriver: " + driverName +
               "\nCapacity: " + capacity;
    }
}