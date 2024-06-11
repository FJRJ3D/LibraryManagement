package org.example;

import java.util.ArrayList;

public class Librarian {

    ArrayList<Books> books = new ArrayList<>();

    public void organize(){

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
