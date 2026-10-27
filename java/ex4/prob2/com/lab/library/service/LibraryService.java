package com.lab.library.service;

import com.lab.library.model.*;

public class LibraryService {

    public void issueItem(LibraryItem item, String memberId) {
        if (item instanceof Borrowable) {
            Borrowable borrowable = (Borrowable) item;

            if (borrowable.borrow(memberId)) {
                System.out.println(item.details() + " issued to " + memberId);
            } else {
                System.out.println(item.getId() + " - already issued");
            }
        } else {
            System.out.println(
                item.getId() + " - Reference only, cannot be borrowed"
            );
        }
    }

    public void returnItem(LibraryItem item, int daysLate) {
        if (item instanceof Borrowable) {
            Borrowable borrowable = (Borrowable) item;
            borrowable.giveBack();

            double fine = borrowable.calculateFine(daysLate);

            System.out.println(
                item.getId() + " returned late by "
                + Math.max(0, daysLate) + " days. Fine = " + fine
            );
        } else {
            System.out.println(
                item.getId() + " - Reference only, cannot be returned"
            );
        }
    }
}