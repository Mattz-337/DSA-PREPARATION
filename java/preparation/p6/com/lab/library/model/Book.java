package com.lab.library.model;

public class Book implements Borrowable, Reservable{
    String title;
    String id;
    String author;
    boolean available = true;

    public Book(String title, String id, String author) {
        this.title = title;
        this.id = id;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getId(){
        return id;
    }

    public boolean borrow(String memberId){
        if(available){
            available = false;
            System.out.println(id+" issue to "+memberId);
            return true;
        }
        System.out.println(id+" already issued");
        return false;
    }

    public void giveBack(){
        available = true;
    }

    public boolean reserve(String memberId){
        System.out.println(id+" reserved for "+memberId);
        return true;
    }
}