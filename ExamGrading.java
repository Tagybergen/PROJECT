/**
 * Класс для оценки экзамена
 */
public class ExamGrading implements GradingStrategy {

    private int correctAnswers;
    private int totalQuestions;

    // Конструктор
    public ExamGrading(int correctAnswers, int totalQuestions) {
        this.correctAnswers = correctAnswers;
        this.totalQuestions = totalQuestions;
    }

    @Override
    public int calculateGrade() {
        if (totalQuestions == 0) {
            return 0; // Защита от деления на 0
        }
        return (correctAnswers * 100) / totalQuestions; // Процент правильных ответов
    }
}
