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

    public void add(String title, String author, String gender, int year, String language){
        books.add(new Books().setTitle(title).setAuthor(author).setGender(gender).setYear(year).setLanguage(language));
        Books lastBook = books.get(books.size() - 1);
        System.out.println("Book added: Title: " +lastBook.getTitle()+ ", Author: " + lastBook.getAuthor() + ", Gender: " + lastBook.getGender() + ", Year: " + lastBook.getYear() + ", Language: " + lastBook.getLanguage());
    }

    public void toRegister(){

    }
}
