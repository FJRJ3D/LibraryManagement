package org.example;

import java.util.ArrayList;

public class Librarian {

    ArrayList<Books> books = new ArrayList<>();
   
    public void organize(){

    }

    public void lookFor(){

    }

    public void add(){

    } 
    public void toRegisterUser(String name, String lastName, String address, int phoneNumber){
        User user = new User(name, lastName, address, phoneNumber);
        user.add(user);
        System.out.println("User registered:" + user);
    }
    public void toRegisterLoan(String book,boolean isLoaned){
        if (book.isLoaned()) {
            System.out.println("The book loaned:" + book);
            return;
        }
        Loan loan = new Loan(book, isLoaned);
        loan.add(loan);
        book.setIsLoand(true);
        System.out.println("Loan registered:" + loan);
    }
    public void toRegister(){
     toRegisterUser("Alberto", "Rodrigez", "Calle Zarza 123", 653428971);
     toRegisterLoan("Las mil leyendas", true);
    }
}
