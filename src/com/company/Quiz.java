package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    private ArrayList<Question> questions;

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestion(Question question) {
        questions.add(question);
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Question> addQuestions() {
        boolean moreQuestions = true;
        ArrayList<Question> questions = new ArrayList<Question>();
        Scanner input = new Scanner(System.in);
        while (moreQuestions) {
            System.out.println("Would you like to add another question to the quiz? (y/n)");
            String more = input.nextLine().toLowerCase();
            if (more.equals("y")) {
                System.out.println("What type of question would you like to add?");
                System.out.println("1: True or False \n2: Multiple Choice \n3: Checkbox");
                int type = input.nextInt();
                if(type == 1){
                    TrueOrFalse tf;
                    System.out.println("Enter a Question");
                    String questionText = input.nextLine();
                    System.out.println("Enter a Point Value");
                    int pointValue = input.nextInt();
                    System.out.println("Enter an answer (true or false)");
                    boolean answerText = input.nextBoolean();
                    tf = new TrueOrFalse(questionText, pointValue, answerText);
                }
            } else if (more.equals("n")) {
                System.out.println("No more questions!");
                moreQuestions = false;
            } else if (!more.equals("n") && !more.equals("y")) {
                System.out.println("Please enter y or n");
            }
        }
        return questions;
    }


    public void Quiz(ArrayList<Question> questions) {

    }


}
