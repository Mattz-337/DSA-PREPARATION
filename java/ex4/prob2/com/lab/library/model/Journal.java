package com.lab.library.model;

public class Journal implements LibraryItem {
    private String id;
    private String title;

    public Journal(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getId() {
        return id;
    }
}