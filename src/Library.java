import java.util.ArrayList;
import java.util.List;

class Library {

    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        books.add(book);
    }


    public List<String> showAllBooks() {
        List<String> bookList = new ArrayList<>();
        for (Book book : books) {
            bookList.add(book.showInfo());
        }
        return bookList;
    }


    public String searchBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book.showInfo();
            }
        }
        return "Book not found";
    }
}









