package org.example;

import java.util.ArrayList;
import java.util.List;

public class Librarian {

    private ArrayList<Books> books = new ArrayList<>();

    // Método para organizar y eliminar libros de la lista.
    public void organize(int choice) {
        if (choice > 0 && choice <= books.size()) {
            Books removedBook = books.remove(choice - 1);
            System.out.println("Book deleted: " + removedBook.getTitle());
        } else if (choice != 0) {
            System.out.println("Invalid choice.");
        }
    }

    // Método para mostrar todos los libros disponibles.
    public List<String> showAllBooks() {
        List<String> bookList = new ArrayList<>();
        for (Books book : books) {
            bookList.add(book.showInfo());
        }
        return bookList;
    }

    // Método para buscar un libro por título.
    public String searchBook(String title) {
        for (Books book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book.showInfo();
            }
        }
        return "Book not found";
    }

    // Método para añadir un nuevo libro a la lista.
    public void add(String title, String author, String gender, int year, String language) {
        books.add(new Books(title, author, gender, year, language));
        Books lastBook = books.get(books.size() - 1);
        System.out.println("Book added: " + lastBook.showInfo());
    }

    public void registerLoan(int bookIndex) {
        if (bookIndex >= 0 && bookIndex < books.size()) {
            Books book = books.get(bookIndex);
            if (!book.isLoaned()) {
                book.setLoaned(true);
                System.out.println("The book '" + book.getTitle() + "' is now marked as loaned.");
            } else {
                System.out.println("The book '" + book.getTitle() + "' is already loaned out.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }
}



