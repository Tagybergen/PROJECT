/**
 * Интерфейс для расчёта оценок
 */
public interface GradingStrategy {
    /**
     * Метод для расчёта оценки
     * @return итоговая оценка
     */
    int calculateGrade();
}
