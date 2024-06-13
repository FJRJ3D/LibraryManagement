package org.example;

public class Books extends Library {

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

}
