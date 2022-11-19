package com.quizApp;

import java.util.LinkedList;

public class Users {
    LinkedList<User> users = new LinkedList<User>();

    public void addUser(User username){
        int f =1;
        for(User checkUser: this.users){
            if(checkUser.name.equals(username.name)){
                f = 0;
            }
        }
        if(f == 1){
            this.users.add(username);
            System.out.println("User Successfully added");
        }
        else{
            System.out.println("User already Exists");
        }
    }

    void changeMarks(User username,int Marks){
        int f =1;
        for(User checkUser: this.users){
            if(checkUser.name.equals(username.name)){
                if(checkUser.marks<=Marks){
                    checkUser.marks = Marks;
                }
                f = 0;
            }
        }
        if(f == 0){
            System.out.println("Marks Successfully added");
        }
        else{
            System.out.println("User doesn't exist");
        }
    }

    void changeResult(User username,String result){
        int f =1;
        for(User checkUser: this.users){
            if(checkUser.name.equals(username.name)){
                checkUser.result = result;
                f = 0;
            }
        }
        if(f == 0){
            System.out.println("Result Successfully changed");
        }
        else{
            System.out.println("User doesn't exist");
        }
    }

    void displayUsers(){
        for(User checkUser: this.users){
            checkUser.displayUser();
        }
    }

}
