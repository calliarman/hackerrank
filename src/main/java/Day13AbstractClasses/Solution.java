package Day13AbstractClasses;

import java.util.*;

abstract class Book {
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    abstract void display();
}


class MyBook extends Book{

    int price;

    MyBook(String title, String author) {
        super(title, author);
    }

    MyBook(String title, String author, int price) {
        super(title, author);
        this.price = price;
    }


    @Override
    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

/**
 *   Class Constructor
 *
 *   @param title The book's title.
 *   @param author The book's author.
 *   @param price The book's price.
 **/

/**
 *   Method Name: display
 *
 *   Print the title, author, and price in the specified format.
 **/


public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int price = scanner.nextInt();
        scanner.close();

        Book book = new MyBook(title, author, price);
        book.display();
    }
}