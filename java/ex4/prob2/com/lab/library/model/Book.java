package com.lab.library.model;

public class Book implements Borrowable, Reservable {
    private String id;
    private String title;
    private String author;
    private boolean available;

    public Book(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.available = true;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public boolean borrow(String memberId) {
        if (available) {
            available = false;
            return true;
        }
        return false;
    }

    @Override
    public void giveBack() {
        available = true;
    }

    @Override
    public boolean reserve(String memberId) {
        return !available;
    }
}