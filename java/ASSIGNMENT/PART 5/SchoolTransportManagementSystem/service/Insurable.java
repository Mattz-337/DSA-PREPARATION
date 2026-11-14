package service;

public interface Insurable {

    double calculateInsurance();

    default void displayInsurance() {
        System.out.println("Vehicle is insured");
    }
}