import service.ExamService;

public class Main {

    public static void main(String[] args) {

        ExamService exam = new ExamService();

        exam.loadSampleQuestions();

        exam.startExam();
    }
}
