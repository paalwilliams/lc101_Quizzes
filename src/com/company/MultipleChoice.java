package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class MultipleChoice extends Question {
    private ArrayList<String> possibleAnswers;

    MultipleChoice(String question, int pointValue, String correctAnswer, ArrayList<String> possibleAnswers) {
        super(question, pointValue, correctAnswer);
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public String askQuestion() {
        System.out.println(this.getQuestion());
        for(int i = 0; i < this.possibleAnswers.size(); i++) {
            System.out.println(possibleAnswers.get(i));
        }
        Scanner input = new Scanner(System.in);
        return "i";
    }

    @Override
    public boolean checkAnswer(String answer) {
        boolean returnAnswer = false;
        for(int i = 0; i < possibleAnswers.size(); i++) {
            if(possibleAnswers.get(i).toLowerCase().equals(answer.toLowerCase())) {
                System.out.println("Correct!");
                returnAnswer = true;
            }
            else {
                System.out.println("Sorry, wrong answer!");
                returnAnswer = false;
            }
            if(returnAnswer) {
                break;
            }
        }
        return returnAnswer;
    }
}
