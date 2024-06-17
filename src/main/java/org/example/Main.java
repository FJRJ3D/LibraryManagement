package org.example;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Librarian librarian = new Librarian();

        System.out.println("WELCOME TO LIBRARY MANAGEMENT");

        while (true) {
            System.out.println("\n1 Erased");
            System.out.println("2 Look for");
            System.out.println("3 Add");
            System.out.println("4 To register");
            System.out.println("5 Exit");
            System.out.print("What do you want to do? (Enter the number): ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\nBooks available to delete:");
                    List<String> books = librarian.showAllBooks();
                    for (int i = 0; i < books.size(); i++) {
                        System.out.println((i + 1) + ". " + books.get(i));
                    }
                    System.out.print("Which book do you want to delete? (Enter the number): ");
                    int bookChoice = input.nextInt();
                    librarian.organize(bookChoice);
                    break;
                case 2:
                    input.nextLine(); // Consume newline left-over
                    System.out.print("Enter the title of the book you're looking for: ");
                    String title = input.nextLine();
                    String bookInfo = librarian.searchBook(title);
                    System.out.println(bookInfo);
                    break;
                case 3:
                    input.nextLine(); // Consume newline left-over
                    System.out.print("Title: ");
                    String newTitle = input.nextLine();
                    System.out.print("Author: ");
                    String author = input.nextLine();
                    System.out.print("Gender: ");
                    String gender = input.nextLine();
                    System.out.print("Year: ");
                    while (!input.hasNextInt()) {
                        System.out.println("That's not a valid year!");
                        input.next(); // Clear the invalid input
                        System.out.print("Please enter the year: ");
                    }
                    int year = input.nextInt();
                    input.nextLine(); // Consume newline left-over
                    System.out.print("Language: ");
                    String language = input.nextLine();
                    librarian.add(newTitle, author, gender, year, language);
                    break;
                case 4:
                System.out.println("\nBooks available to loan:");
                List<String> availableBooks = librarian.showAllBooks();
                for (int i = 0; i < availableBooks.size(); i++) {
                    System.out.println((i + 1) + ". " + availableBooks.get(i));
                }
                System.out.print("Which book do you want to loan out? (Enter the number): ");
                int bookToLoan = input.nextInt() - 1;
                librarian.registerLoan(bookToLoan);
                break;
                case 5:
                    System.out.println("Exiting the system...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
}
