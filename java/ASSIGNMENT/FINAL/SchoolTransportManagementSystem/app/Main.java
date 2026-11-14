package app;

import model.*;
import service.*;

public class Main {

    public static void main(String[] args) {

        // Creating objects
        SchoolVehicle defaultVehicle = new SchoolVehicle();

        SchoolVehicle[] vehicles = {
            new Van(101, "TN38AB1234", "Ravi", 15),
            new MiniBus(102, "TN38CD5678", "Kumar", 25),
            new Bus(103, "TN38EF9012", "Arun", 50)
        };

        InsuranceService service = new InsuranceService();

        System.out.println("SCHOOL TRANSPORT MANAGEMENT SYSTEM");

        System.out.println("\nDefault Vehicle:");
        System.out.println(defaultVehicle);

        // Runtime polymorphism
        for (SchoolVehicle v : vehicles) {

            System.out.println("\n" + v);

            System.out.println("Monthly Fee: " +
                               v.calculateMonthlyFee());

            service.displayInsurance(v);
        }

        // Method overloading
        System.out.println("\nDiscounted Van Fee: " +
                           vehicles[0].calculateMonthlyFee(10));

        // Custom checked exception
        try {
            vehicles[0].assignPassengers(20);
        }
        catch (CapacityExceededException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Passenger allocation completed.");
        }

        // Built-in exceptions using multi-catch
        for (int i = 0; i < 2; i++) {

            try {
                if (i == 0) {
                    int divisor = 0;
                    int result = 10 / divisor;
                } else {
                    int number = Integer.parseInt("ABC");
                }
            }
            catch (ArithmeticException |
                   NumberFormatException e) {

                System.out.println("Built-in Exception: " +
                                   e.getMessage());
            }
        }

        System.out.println("\nTotal Vehicles: " +
                           SchoolVehicle.getVehicleCount());
    }
}