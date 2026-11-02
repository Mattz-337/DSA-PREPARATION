package com.lab.library.model;

class Journal implements LibraryItem{
    String title;
    String id;

    public Journal(String title,String id){
        this.title = title;
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }
}