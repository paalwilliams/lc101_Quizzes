package com.company;

import java.util.Scanner;

public class TrueOrFalse extends Question {

    public TrueOrFalse(String question, int pointValue, String correctAnswer){
        super(question, pointValue, correctAnswer);
    }

    @Override
    public String askQuestion() {
        System.out.println(this.getQuestion());
        return this.getQuestion();
    }




}
