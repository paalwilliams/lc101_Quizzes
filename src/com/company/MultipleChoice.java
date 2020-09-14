package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class MultipleChoice extends Question {
    private int correctAnswer;
    private ArrayList<String> possibleAnswers;

    MultipleChoice(String question, int pointValue, int correctAnswer, ArrayList<String> possibleAnswers) {
        super(question, pointValue);
        this.correctAnswer = correctAnswer;
        this.possibleAnswers = possibleAnswers;
    }

    public boolean checkAnswer(String answer) {
        if(possibleAnswers.indexOf(answer.toLowerCase()) == correctAnswer) {
            return true;
        }
        else {
            return false;
        }

    }
}
