package com.kshitij.library.management.Util;


import com.kshitij.library.management.DataAccessLayer.Book;

public class BookValidator {

    public boolean isValid(Book book){

        if(book.getTitle()=="" || book.getTitle().equals(null))
            return false;
        return true;
    }
}
