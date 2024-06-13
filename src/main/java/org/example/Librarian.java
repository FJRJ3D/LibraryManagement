package org.example;

import java.util.ArrayList;

public class Librarian {

    ArrayList<Books> books = new ArrayList<>();

    public void organize(int choice){

        System.out.println("Books list:");
        
        if (choice > 0 && choice <= books.size()) {
            Books removedBook = books.remove(choice - 1);
            System.out.println("Book deleted: " + removedBook.getTitle());

        }else if (choice != 0) {
            System.out.println("Invalid choice.");
        }

    }

    public void lookFor(){

    }

    public void add(){

    }

    public void toRegister(){

    }
}
