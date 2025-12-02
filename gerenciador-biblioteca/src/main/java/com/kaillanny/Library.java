package com.kaillanny;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
    ArrayList<Book> bookCollection;
    ArrayList<Member> members;

    Scanner scan = new Scanner(System.in);

    

    void addBook(String title, Author author, boolean borrow) {
        Book livro = new Book(title, author, borrow);
        bookCollection.add(livro);
    }

}
