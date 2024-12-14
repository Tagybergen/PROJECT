import java.util.*;

public class Main {
    // Список пользователей (имитация базы данных)
    private static List<User> users = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the Student Management System!");

        // Выбор языка
        Language language = selectLanguage();

        while (true) {
            System.out.println("\nMain Menu:");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // очистка буфера

            switch (choice) {
                case 1:
                    registerUser(language);
                    break;
                case 2:
                    loginUser(language);
                    break;
                case 3:
                    System.out.println("Exiting the system. Goodbye!");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Метод для выбора языка
    private static Language selectLanguage() {
        System.out.println("Please select your language:");
        for (Language lang : Language.values()) {
            System.out.println(lang.ordinal() + 1 + ". " + lang);
        }
        System.out.print("Enter your choice: ");
        int langChoice = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        if (langChoice > 0 && langChoice <= Language.values().length) {
            Language selectedLanguage = Language.values()[langChoice - 1];
            System.out.println("Language selected: " + selectedLanguage);
            return selectedLanguage;
        } else {
            System.out.println("Invalid choice. Defaulting to EN.");
            return Language.EN;
        }
    }

    // Метод для регистрации пользователя
    private static void registerUser(Language language) {
        System.out.println("Select your role:");
        for (Role role : Role.values()) {
            System.out.println(role.ordinal() + 1 + ". " + role);
        }
        System.out.print("Enter your choice: ");
        int roleChoice = scanner.nextInt();
        scanner.nextLine(); // очистка буфера

        if (roleChoice > 0 && roleChoice <= Role.values().length) {
            Role selectedRole = Role.values()[roleChoice - 1];

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your email: ");
            String email = scanner.nextLine();

            System.out.print("Enter your password: ");
            String password = scanner.nextLine();

            // Создание пользователя на основе роли
            User user = createUser(selectedRole, name, email, password, language);
            if (user != null) {
                users.add(user);
                System.out.println("Registration successful! Your ID is: " + user.getId());
            } else {
                System.out.println("Failed to register. Please try again.");
            }
        } else {
            System.out.println("Invalid role choice.");
        }
    }

    // Метод для создания пользователя на основе роли
    private static User createUser(Role role, String name, String email, String password, Language language) {
        switch (role) {
            case STUDENT:
                return new Student(UUID.randomUUID().toString(), name, email, password, Role.STUDENT, language, 1);
            case TEACHER:
                return new Teacher(UUID.randomUUID().toString(), name, email, password, Role.TEACHER, language, "Math", false);
            case MANAGER:
                return new Manager(UUID.randomUUID().toString(), name, email, password, Role.MANAGER, language, "Admin Dept", "Manager");
            case TECH_SUPPORT:
                return new TechSupport(UUID.randomUUID().toString(), name, email, password, Role.TECH_SUPPORT, language, "Support Dept", "Support Specialist");
            default:
                System.out.println("Role not implemented yet.");
                return null;
        }
    }

    // Метод для входа пользователя
    private static void loginUser(Language language) {
        System.out.print("Enter your email: ");
        String email = scanner.nextLine();

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        // Проверка данных пользователя
        for (User user : users) {
            if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                System.out.println("Login successful! Welcome, " + user.getName() + " (" + user.getRole() + ")");
                return;
            }
        }
        System.out.println("Login failed. Incorrect email or password.");
    }
}
