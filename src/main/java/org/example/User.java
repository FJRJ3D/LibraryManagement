package org.example;

public class User {
    private String name;
    private String lastName;
    private String address;
    private int phoneNumber;
}

public User(String name, String lastName, String address, int phoneNumber){
    this.name = name;
    this.lastName= lastName;
    this.address = address;
    this.phoneNumber = phoneNumber;
}
//Getters y Setters
public String getName(){
    return name;
}
public void setName(String name){
    this.name = name;
}
public String getLastName(){
    return lastName;
}
public void setLastName(String lastName){
    this.lastName = lastName;
}
public String getAddress(){
    return address;
}
public void setAddress(String address){
    this.address = address;
}
public int getPhoneNumber(){
    return phoneNumber;
}
public void setPhoneNumber (){
    this.phoneNumber = phoneNumber;
}


public String toString() {
    return "User: " + name + " " + lastName + "\nAddress: " + address + "\nPhone: " + phoneNumber;
}
public void add(User user) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'add'");
}

