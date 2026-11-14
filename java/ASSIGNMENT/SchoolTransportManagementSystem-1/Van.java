class Van extends SchoolVehicle {

    Van(int id, String reg, String driver, int capacity) {
        super(id, reg, driver, capacity);
    }

    @Override
    public double calculateMonthlyFee() {
        return getCapacity() * 600;
    }

    public void displayVanType() {
        System.out.println("Type: School Van");
    }
}