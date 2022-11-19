package com.quizApp;

public class Question {
    String question;
    String opt1;
    String opt2;
    String opt3;
    String opt4;
    String ans;

    public Question(String question, String opt1, String opt2, String opt3, String opt4, String ans) {
        this.question = question;
        this.opt1 = opt1;
        this.opt2 = opt2;
        this.opt3 = opt3;
        this.opt4 = opt4;
        this.ans = ans;
    }

    public String getQuestion() {
        return question;
    }

    public void showQuestion(int q){
        System.out.println("-".repeat(30));
        System.out.println(q+". "+this.question);
        System.out.println("1. "+this.opt1);
        System.out.println("2. "+this.opt2);
        System.out.println("3. "+this.opt3);
        System.out.println("4. "+this.opt4);
        System.out.println("-".repeat(30));
    }

    public String getAnswer(){
        return this.ans;
    }

    public boolean checkAnswer(String option){
        if(this.ans.equals(option)){
            return true;
        }
        return false;
    }
}
