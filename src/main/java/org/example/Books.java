package main.java.org.example;


public class Books extends Library {

    private String title;
    private String author;
    private String gender;
    private int year;
    private String language;
    private boolean isLoaned;

    public Books(String title, String author, String gender, int year, String language) {
        this.title = title;
        this.author = author;
        this.gender = gender;
        this.year = year;
        this.language = language;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public boolean isLoaned() {
        return isLoaned;
    }

    public void setLoaned(boolean loaned) {
        isLoaned = loaned;
    }

    public String showInfo() {
        return "Title: " + title + ", Author: " + author + ", Gender: " + gender + ", Year: " + year + ", Language: " + language;
    }
}
