package com.company;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class QuizRunner {
    public static void main(String[] args) {

        TrueOrFalse tf = new TrueOrFalse("Is true false?", 1, "false");
        ArrayList<String> al = new ArrayList<String>();
        al.add("A");
        al.add("B");
        al.add("C");
        MultipleChoice mc = new MultipleChoice("Select A", 1, "A", al);
        ArrayList<Question> myQuestions = new ArrayList<Question>();
        myQuestions.add(tf);
        myQuestions.add(mc);

        Quiz myQuiz = new Quiz(myQuestions);

        for(int i = 0; i < myQuiz.getQuestions().size(); i++) {
            myQuiz.getQuestion(i).askQuestion();
            Scanner input = new Scanner(System.in);
            String answer = input.nextLine();
            myQuiz.getQuestion(i).checkAnswer(answer);

        }
    }
}
