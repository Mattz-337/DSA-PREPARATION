package com.lab.library.app;

import com.lab.library.model.*;
import com.lab.library.service.LibraryService;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book(
            "B101", "Data Structures", "Mark Allen"
        );

        Book book2 = new Book(
            "B102", "Java Programming", "James Gosling"
        );

        Magazine magazine = new Magazine(
            "M201", "Tech Today"
        );

        Journal journal = new Journal(
            "J301", "Research Journal"
        );

        LibraryItem[] items = {
            book1, book2, magazine, journal
        };

        LibraryService service = new LibraryService();

        // Issue every item
        for (LibraryItem item : items) {
            service.issueItem(item, "M01");
        }

        System.out.println();

        // Try issuing the same book twice
        service.issueItem(book1, "M02");

        System.out.println();

        // Reserve a book that is currently issued
        if (book1.reserve("M02")) {
            System.out.println(book1.getId() + " reserved for M02");
        } else {
            System.out.println("Book cannot be reserved");
        }

        System.out.println();

        // Return items with different delays
        service.returnItem(book1, 5);
        service.returnItem(book2, 0);
        service.returnItem(magazine, 5);
    }
}