package org.example;

public static class Loan{
    private String book;
    private boolean isLoaned;
}

public Loan(String book,boolean isLoaned) {
    this.book = book;
    this.isLoaned = false;

}
//Getters y Setters
public String getBook(){
    return book;
}
public void setBook(String book){
    this.book = book;
}
public boolean getIsLoand(){
    return isLoaned;
}
public void setIsLoand(boolean isLoaned){
    this.isLoaned = isLoaned;
}

public String toString() {
    return  "Loan: " + book +  isLoaned;
}
public void add(Loan loan) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
}

