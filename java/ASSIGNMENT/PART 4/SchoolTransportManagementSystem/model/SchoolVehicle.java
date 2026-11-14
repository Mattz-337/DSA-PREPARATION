package model;

public class SchoolVehicle {

    private int vehicleId;
    private String registrationNumber;
    private String driverName;
    private int capacity;

    static int vehicleCount = 0;

    public SchoolVehicle(int id, String reg, String driver, int capacity) {
        this.vehicleId = id;
        this.registrationNumber = reg;
        this.driverName = driver;
        this.capacity = capacity;
        vehicleCount++;
    }

    public int getCapacity() {
        return capacity;
    }

    public double calculateMonthlyFee() {
        return capacity * 500;
    }

    public String toString() {
        return "Vehicle ID: " + vehicleId +
               "\nRegistration: " + registrationNumber +
               "\nDriver: " + driverName +
               "\nCapacity: " + capacity;
    }
}