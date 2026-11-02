package com.lab.library.app;

import java.ex4.prob2.com.lab.library.model.Journal;
import java.ex4.prob2.com.lab.library.model.Magazine;

import com.lab.library.model.*;
import com.lab.library.service.LibraryService;

public class Main{
    public static void main(String[] args){
        LibraryItem[] items = {
            new Book("Data Structures", "B101", "Mark"),
            new Book("Java Programming", "B102", "James"),
            new Magazine("Tech Today", "M201"),
            new Journal("Research Journal", "J301")
        }

        java.preparation.p6.com.lab.library.service.LibraryService service = new LibraryService();

        for(LibraryItem item:items){
            service.issueItem(item,"M01");
        }

        service.issueItem(item[0],"M02");


    }
}