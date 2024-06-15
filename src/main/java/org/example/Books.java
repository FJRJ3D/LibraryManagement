package org.example;

public class Books extends Library {

    private String title;
    private String title;
    private String author;
    private String gender;
    private int year;
    private String language;

        public String getTitle() {
            return title;
        }

        public Books setTitle(String title) {
            this.title = title;
            return this;
        }

        public String getAuthor() {
            return author;
        }

        public Books setAuthor(String author) {
            this.author = author;
            return this;
        }

        public String getGender() {
            return gender;
        }

        public Books setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public int getYear() {
            return year;
        }

        public Books setYear(int year) {
            this.year = year;
            return this;
        }

        public String getLanguage() {
            return language;
        }

        public Books setLanguage(String language) {
            this.language = language;
            return this;
        }

}
