package com.company;

public class TrueOrFalse extends Question {
    private boolean correctAnswer;

    public TrueOrFalse(String question, int pointValue, boolean correctAnswer){
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
    }

    public boolean checkQuestion(boolean answer) {
        if(this.correctAnswer == answer) {
            System.out.println("Correct!");
            return true;
        }
        else {
            System.out.println("Sorry, wrong answer");
            return false;
        }
    }
}
