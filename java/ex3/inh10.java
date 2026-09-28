interface Insurable {

    double calculatePremium();
}

class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }
}

class Car extends Vehicle implements Insurable {

    double price;

    Car(String brand, double price) {
        super(brand);
        this.price = price;
    }

    public double calculatePremium() {
        return price * 5 / 100;
    }
}

class Bike extends Vehicle implements Insurable {

    double price;

    Bike(String brand, double price) {
        super(brand);
        this.price = price;
    }

    public double calculatePremium() {
        return price * 3 / 100;
    }
}

class main {

    public static void main(String[] args) {

        Car c = new Car("Mini", 1000000);

        Bike b = new Bike("TVS", 30000);

        System.out.println("Car Brand: " + c.brand);
        System.out.println("Car Premium: " + c.calculatePremium());

        System.out.println();

        System.out.println("Bike Brand: " + b.brand);
        System.out.println("Bike Premium: " + b.calculatePremium());
    }
}