package com.lab.library.model;

public interface LibraryItem {
    int MAX_LOAN_DAYS = 14;

    String getTitle();
    String getId();

    default String details() {
        return getId() + " - " + getTitle();
    }
}