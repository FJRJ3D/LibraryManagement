import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Library library = new Library();


        library.addBook(new Book("The Secret", "Rhonda Byrne", 2006, "Self-help"));
        library.addBook(new Book("Harry Potter and the Philosopher's Stone", "J.K. Rowling", 1997, "Fantasy"));
        library.addBook(new Book("Two Twisted Crowns", "Rachel Gillig", 2023, "Fantasy"));


        System.out.println("Welcome to the library");
        System.out.println("List of all books:");




        System.out.print("\nEnter the title of the book you want to search for: ");
        String searchedTitle = scanner.nextLine();
        String result = library.searchBook(searchedTitle);

        System.out.println("\nSearch result:");
        System.out.println(result);
    }
}