package com.company;
import java.util.Scanner;

public class Question {
    protected String Question;
    protected int pointValue;

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public int getPointValue() {
        return pointValue;
    }

    public void setPointValue(int pointValue) {
        this.pointValue = pointValue;
    }

    public String correctAnswer;

    Question(String Question, int pointValue, String correctAnswer) {
    this.Question = Question;
    this.pointValue = pointValue;
    this.correctAnswer = correctAnswer;
    }

    public String askQuestion(){return "a";}

    public boolean checkAnswer(String answer) {
        if(this.correctAnswer.equals(answer)) {
            System.out.println("Correct!");
            return true;
        }
        else {
            System.out.println("Sorry, wrong answer");
            return false;
        }
    }


}