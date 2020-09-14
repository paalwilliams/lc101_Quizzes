package com.company;

import java.util.HashMap;

public class CheckBox extends Question{
    public HashMap<String, Boolean> questions;


    public HashMap<String, Boolean> getQuestions() {
        return questions;
    }

    public void setQuestions(HashMap<String, Boolean> questions) {
        this.questions = questions;
    }

    public CheckBox(String question, int pointValue, HashMap<String, Boolean> questions, String correctAnswer) {
        super(question, pointValue, correctAnswer);
        this.questions = questions;

    }
}
