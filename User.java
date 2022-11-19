package com.quizApp;

public class User {
    String name;
    int marks;
    String result;

    public User(String name, int marks, String result) {
        this.name = name;
        this.marks = marks;
        this.result = result;
    }

    public void displayUser(){
        System.out.println("-".repeat(30));
        System.out.println("Username : "+this.name);
        System.out.println("Marks : "+this.marks);
        System.out.println("Result : "+this.result);
        System.out.println("-".repeat(30));
    }
}
