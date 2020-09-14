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

    Question(String Question, int pointValue) {
    this.Question = Question;
    this.pointValue = pointValue;
    }

    public String askQuestion() {
        System.out.println(this.Question + " \n True/False:");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        return answer;
    }


}