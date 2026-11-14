package service;

import model.SchoolVehicle;

public class InsuranceService {

    public void displayInsurance(SchoolVehicle v) {

        if (v instanceof Insurable) {
            Insurable i = (Insurable) v;

            System.out.println("Insurance: " +
                               i.calculateInsurance());

            i.displayInsurance();
        }
    }
}