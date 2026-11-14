package app;

import model.*;
import service.*;

public class Main {

    public static void main(String[] args) {

        SchoolVehicle[] vehicles = {
            new Van(101, "TN38AB1234", "Ravi", 15),
            new MiniBus(102, "TN38CD5678", "Kumar", 25),
            new Bus(103, "TN38EF9012", "Arun", 50)
        };

        InsuranceService service = new InsuranceService();

        for (SchoolVehicle v : vehicles) {

            System.out.println(v);

            System.out.println("Monthly Fee: " +
                               v.calculateMonthlyFee());

            service.displayInsurance(v);

            System.out.println();
        }
    }
}