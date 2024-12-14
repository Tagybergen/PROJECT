import java.util.*;

/**
 * Класс Admin, представляющий администратора системы
 */
public class Admin extends User {

    // Список лог-файлов
    public List<String> logFiles;

    // Единственный экземпляр класса (Singleton)
    private static Admin instance;

    /**
     * Приватный конструктор для реализации Singleton
     */
    private Admin(String id, String name, String email, String password, Role role, Language language) {
        super(id, name, email, password, role, language);
        this.logFiles = new ArrayList<>();
    }

    /**
     * Метод для получения единственного экземпляра Admin
     *
     * @return экземпляр Admin
     */
    public static Admin getInstance() {
        if (instance == null) {
            // Создаем экземпляр с базовыми параметрами
            instance = new Admin("admin1", "System Admin", "admin@example.com", "admin123", Role.ADMIN, Language.EN);
        }
        return instance;
    }

    /**
     * Метод для создания нового пользователя
     *
     * @param user Пользователь для добавления
     */
    public void createUser(User user) {
        // Логируем операцию
        logFiles.add("Пользователь " + user.getName() + " создан.");
        System.out.println("Пользователь " + user.getName() + " успешно создан.");
    }

    /**
     * Метод для назначения роли пользователю
     *
     * @param user Пользователь
     * @param role Новая роль
     */
    public void assignRole(User user, Role role) {
        user.setRole(role);
        logFiles.add("Пользователю " + user.getName() + " назначена роль: " + role);
        System.out.println("Пользователю " + user.getName() + " назначена роль: " + role);
    }

    /**
     * Метод для удаления пользователя
     *
     * @param user Пользователь для удаления
     */
    public void removeUser(User user) {
        logFiles.add("Пользователь " + user.getName() + " удален.");
        System.out.println("Пользователь " + user.getName() + " успешно удален.");
    }

    /**
     * Приватный метод admin для выполнения административных задач
     */
    private void admin() {
        System.out.println("Выполнение административных задач...");
    }

    /**
     * Метод для просмотра логов
     *
     * @return Список логов
     */
    public List<String> viewLogs() {
        return logFiles;
    }
}
