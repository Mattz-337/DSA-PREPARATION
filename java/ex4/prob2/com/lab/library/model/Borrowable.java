package com.lab.library.model;

public interface Borrowable extends LibraryItem {
    boolean borrow(String memberId);
    void giveBack();

    default double calculateFine(int daysLate) {
        return Math.max(0, daysLate) * 2.0;
    }
}