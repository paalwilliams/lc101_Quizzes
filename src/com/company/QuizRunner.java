package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Objects;

public class QuizRunner {
    public static void main(String[] args) {
        Quiz myQuiz = new Quiz();
        ArrayList<Question> myQuestions = myQuiz.addQuestions();
        for (int i = 0; i <= myQuestions.size(); i++) {
            System.out.println(myQuestions.get(i));
        }
    }
}
