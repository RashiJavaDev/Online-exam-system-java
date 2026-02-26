package model;

public class Question {
    private String questionText;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private char correctAnswer;

    public Question(String questionText, String a, String b,
                    String c, String d, char correctAnswer) {
        this.questionText = questionText;
        this.optionA = a;
        this.optionB = b;
        this.optionC = c;
        this.optionD = d;
        this.correctAnswer = correctAnswer;
    }

    public void displayQuestion() {
        System.out.println(questionText);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }

    public boolean checkAnswer(char answer) {
        return Character.toUpperCase(answer) == correctAnswer;
    }
}
