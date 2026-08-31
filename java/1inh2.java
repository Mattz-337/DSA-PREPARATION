class Vechicle {

    int speed;
    String fuelType;

    Vechicle(int speed, String fuelType) {
        this.speed = speed;
        this.fuelType = fuelType;
    }

    void display() {
        System.out.println("speed: " + speed);
        System.out.println("fuelType: " + fuelType);
    }
}

class Car extends Vechicle {

    int numberOfDoors;

    Car(int speed, String fuelType, int numberOfDoors) {
        super(speed, fuelType);
        this.numberOfDoors = numberOfDoors;
    }

    void display() {
        System.out.println("speed: " + speed);
        System.out.println("fuelType: " + fuelType);
        System.out.println("number of doors: " + numberOfDoors);
    }
}

class main {

    public static void main(String[] args) {

        Car c = new Car(50, "petrol", 4);

        c.display();
    }
}