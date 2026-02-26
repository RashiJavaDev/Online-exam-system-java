package service;

import model.Question;
import java.util.ArrayList;
import java.util.Scanner;

public class ExamService {

    private ArrayList<Question> questions = new ArrayList<>();

    public void loadSampleQuestions() {
        questions.add(new Question(
                "What is 2 + 2?",
                "3", "4", "5", "6", 'B'));

        questions.add(new Question(
                "Java is a?",
                "Programming Language", "Car", "Game", "Animal", 'A'));
    }

    public void startExam() {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        for (Question q : questions) {
            q.displayQuestion();
            System.out.print("Your answer: ");
            char ans = sc.next().charAt(0);

            if (q.checkAnswer(ans)) {
                score++;
            }
        }

        System.out.println("Final Score: " + score);
    }
}
