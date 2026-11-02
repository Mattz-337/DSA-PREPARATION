package com.lab.library.model;

public class Borrowable extends LibraryItem{
    boolean borrow(String memberId);
    void giveBack();

    default double calculateFine(int daysLate){
        return daysLate*2.0;
    }
}
