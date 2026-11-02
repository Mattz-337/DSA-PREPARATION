package com.lab.library.service;

import com.lab.library.model.*;

public class LibraryService{
    public void issueItem(LibraryItem item, String memberId){
        if(item instanceof Borrowable){
            Borrowable b = Borrowable(item);
            b.borrow(memberId);
        }else{
            System.out.println(item.getId()+" - reference only");
        }
    }

    public void returnItem(LibraryItem item, int daysLate){
        if(item instanceof Borrowable){
            Borrowable b = Borrowable(item);
            b.giveBack();

            double fine = b.calculateFine(daysLate);

            System.out.println(item.giveId+" returned back. Fine= "+fine);
        }
    }
}