package com.lab.library.model;

class Magazine implements Borrowable{
    String title;
    String id;
    boolean available = true;

    public Magazine(String title,String id,boolean available){
        this.title = title;
        this.id = id;
        this.available = available;
    }

    @Override 
    public double calculateFine(int daysLate){
        return daysLate*1.0;
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
}