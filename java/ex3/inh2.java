class Vechicle{
    int speed;
    String fuelType;
    Vechicle(int speed,String fuelType){
        this.speed=speed;
        this.fuelType=fuelType;
    }
}

class Car extends Vechicle{
    int numberOfDoors;
    Car(int speed,String fuelType,int numberOfDoors){
        super(speed, fuelType);
        this.numberOfDoors=numberOfDoors;
    }
    void Display(){
        System.out.println("Speed: "+speed);
        System.out.println("Fuel Type: "+fuelType);
        System.out.println("no of doors: "+numberOfDoors);
    }
}

class main{
    public static void main(String[] args) {
        Car c = new Car(50, "petrol", 4);
        c.Display();
    }
}