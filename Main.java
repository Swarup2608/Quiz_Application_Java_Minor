package com.quizApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Users exam1 = new Users();
        Exam exam11 = new Exam();
        Question qu1 = new Question("Which is used to find and fix bugs in the Java programs?","JVM","JDB","JDK","JRE","opt2");
        Question qu2 = new Question("What is the return type of the hashCode() method in the Object class?","int","Object","long","void","opt1");
        Question qu3 = new Question("Which package contains the Random class?","java.util package","java.lang package","java.lang package","java.io package","opt1");
        Question qu4 = new Question("An interface with no fields or methods is known as?","Runnable Interface","Abstract Interface","Marker Interface","CharSequence Interface","opt3");
        Question qu5 = new Question("In which memory a String is stored, when we create a string using new operator?","Stack","String memory","Random storage space","Heap memory","opt4");
        Question qu6 = new Question("Which of the following is a marker interface?","Runnable interface","Remote interface","Readable interface","Result interface","opt2");
        Question qu7 = new Question("Which keyword is used for accessing the features of a package?","import","package","extends","export","opt1");
        Question qu8 = new Question("In java, jar stands for?","Java Archive Runner","Java Archive","Java Application Resource","Java Application Runner","opt2");
        Question qu9 = new Question("Which of the following is a mutable class in java?","java.lang.StringBuilder","java.lang.Short ","java.lang.Byte","java.lang.String","opt1");
        Question qu10 = new Question("Which of the following option leads to the portability and security of Java?","Bytecode is executed by JVM","The applet makes the Java code secure and portable","Use of exception handling","Dynamic binding between objects","opt1");
        exam11.addQuestion(qu1);
        exam11.addQuestion(qu2);
        exam11.addQuestion(qu3);
        exam11.addQuestion(qu4);
        exam11.addQuestion(qu5);
        exam11.addQuestion(qu6);
        exam11.addQuestion(qu7);
        exam11.addQuestion(qu8);
        exam11.addQuestion(qu9);
        exam11.addQuestion(qu10);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Users Count : ");
        int number_of_users = sc.nextInt();
        for(int i = 0;i<number_of_users;i++){
            System.out.println("Enter Users Name : ");
            String name = sc.next();
            User u1 = new User(name,0,"Yet to attempt");
            exam1.addUser(u1);
            u1.displayUser();
            System.out.println("Exam is going to start now");
            System.out.println("-".repeat(100));
            int marks = exam11.startTest();
            exam1.changeMarks(u1,marks);
            if(marks>=5){
                exam1.changeResult(u1,"Successfully Passed!!!");
            }
            else{
                exam1.changeResult(u1,"Failed!!!");
            }

        }
        exam1.displayUsers();


    }
}