package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Librarian librarian = new Librarian();

        System.out.println("WELCOME TO LIBRARY MANAGEMENT");


        while (true) {
            System.out.println(" ");
            System.out.println("1 Organize");
            System.out.println("2 Look for");
            System.out.println("3 Add");
            System.out.println("4 To register");
            System.out.println("5 Exit");
            System.out.println(" ");
            System.out.print("What do you want to do? (Enter the number): ");

            int choice = input.nextInt();

            if (choice==1) {
                //lookFor(); Cuando este implementado lookFor podrá mostrar los libros qu epuede borrar.
                System.out.println(" ");
                System.out.print("What Book do you want to delete? ");
                librarian.organize(input.nextInt());

            }else if (choice==2) {

            }else if (choice==3) {

            }else if (choice==4){

            }else if (choice==5){
                break;
            }
        }
        input.close();

    }
}