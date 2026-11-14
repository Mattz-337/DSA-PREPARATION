class Bus extends SchoolVehicle {

    Bus(int id, String reg, String driver, int capacity) {
        super(id, reg, driver, capacity);
    }

    @Override
    public double calculateMonthlyFee() {
        return getCapacity() * 800;
    }

    public void displayBusType() {
        System.out.println("Type: School Bus");
    }
}