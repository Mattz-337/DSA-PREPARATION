class MiniBus extends SchoolVehicle {

    MiniBus(int id, String reg, String driver, int capacity) {
        super(id, reg, driver, capacity);
    }

    @Override
    public double calculateMonthlyFee() {
        return getCapacity() * 700;
    }

    public void displayMiniBusType() {
        System.out.println("Type: School MiniBus");
    }
}