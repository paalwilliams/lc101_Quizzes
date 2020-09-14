package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public Question getQuestion( int num ) {return questions.get(num);}

    public void setQuestion(Question question) {
        questions.add(question);
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }


}
