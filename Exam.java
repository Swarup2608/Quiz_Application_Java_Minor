package com.quizApp;

import java.util.LinkedList;
import java.util.Scanner;

public class Exam {
    LinkedList<Question> questions = new LinkedList<Question>();

    public void  addQuestion(Question question){
        int f =1;
        for(Question checkQ: this.questions){
            if(checkQ.question.equals(question.question)){
                f = 0;
            }
        }
        if(f == 1){
            this.questions.add(question);
            System.out.println("Question Successfully added");
        }
        else{
            System.out.println("Question already Exists");
        }
    }
    public void  removeQuestion(Question question){
        int f =1;
        for(Question checkQ: this.questions){
            if(checkQ.question.equals(question.question)){
                f = 0;
            }
        }
        if(f == 0){
            this.questions.remove(question);
            System.out.println("Question Successfully removed");
        }
        else{
            System.out.println("Question doesn't Exist");
        }
    }

    public void displayQuestions(){
        int i = 0;
        for(Question checkQ: this.questions){
            checkQ.showQuestion(++i);
        }
    }

    public int startTest(){
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int marks = 0;
        for(Question checkQ: this.questions){
            checkQ.showQuestion(++i);
            String ans = sc.next();
            boolean res = checkQ.checkAnswer("opt"+ans);
            if(res){
                marks+=1;
                System.out.println("Correct Answer!!! Your score : "+marks);
            }
            else{
                marks-=1;
                System.out.println("Wrong Answer!!! Your score : "+marks);
            }
        }
        return marks;
    }
}
