package com.lab.library.model;

public class Magazine implements Borrowable {
    private String id;
    private String title;
    private boolean available;

    public Magazine(String id, String title) {
        this.id = id;
        this.title = title;
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
    public double calculateFine(int daysLate) {
        return Math.max(0, daysLate) * 1.0;
    }
}