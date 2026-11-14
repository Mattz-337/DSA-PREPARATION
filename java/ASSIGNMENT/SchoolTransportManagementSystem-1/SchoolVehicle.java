class SchoolVehicle {

    private int vehicleId;
    private String registrationNumber;
    private String driverName;
    private int capacity;

    static int vehicleCount = 0;

    SchoolVehicle() {
        this.vehicleId = 0;
        this.registrationNumber = "Not Assigned";
        this.driverName = "Not Assigned";
        this.capacity = 0;
        vehicleCount++;
    }

    SchoolVehicle(int vehicleId, String registrationNumber,
                  String driverName, int capacity) {

        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.driverName = driverName;
        this.capacity = capacity;

        vehicleCount++;
    }

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

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double calculateMonthlyFee() {
        return capacity * 500;
    }

    public double calculateMonthlyFee(double discount) {
        double fee = capacity * 500;
        return fee - (fee * discount / 100);
    }

    @Override
    public String toString() {
        return "Vehicle ID: " + vehicleId +
               "\nRegistration Number: " + registrationNumber +
               "\nDriver Name: " + driverName +
               "\nCapacity: " + capacity;
    }
}