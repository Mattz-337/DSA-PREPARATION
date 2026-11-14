package app;

import model.*;
import service.*;

public class Main {

    public static void main(String[] args) {

        SchoolVehicle van =
            new Van(101, "TN38AB1234", "Ravi", 15);

        try {
            van.assignPassengers(20);
        }
        catch (CapacityExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Passenger allocation completed.");
        }

        try {
            int a = 10 / 0;
            int b = Integer.parseInt("ABC");
        }
        catch (ArithmeticException | NumberFormatException e) {
            System.out.println("Built-in Exception: " + e);
        }
    }
}