/**
 * Класс для оценки проекта
 */
public class ProjectGrading implements GradingStrategy {

    private int completedStages;
    private int totalStages;

    // Конструктор
    public ProjectGrading(int completedStages, int totalStages) {
        this.completedStages = completedStages;
        this.totalStages = totalStages;
    }

    @Override
    public int calculateGrade() {
        if (totalStages == 0) {
            return 0; // Защита от деления на 0
        }
        return (completedStages * 100) / totalStages; // Процент выполненных этапов
    }
}
