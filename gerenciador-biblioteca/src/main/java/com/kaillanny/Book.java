package com.kaillanny;

public class Book {
    private String title;
    private Author author;
    private boolean borrow;


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Author getAuthor() {
        return author;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public boolean isBorrow() {
        return borrow;
    }
    public void setBorrow(boolean borrow) {
        this.borrow = borrow;
    }


    public Book(String title, Author author, boolean borrow) {
        this.title = title;
        this.author = author;
        this.borrow = borrow;
    }

    
    
}
