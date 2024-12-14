import java.util.ArrayList;
import java.util.List;

public class TechSupport extends Employee {

    private List<Orders> orders = new ArrayList<>();

    // Конструктор с параметрами
    public TechSupport(String id, String name, String email, String password, Role role, Language language, String department, String position) {
        super(id, name, email, password, role, language, department, position);
    }

    // Конструктор по умолчанию
    public TechSupport() {
        super(
                "default_id",
                "Default Name",
                "default_email@example.com",
                "default_password",
                Role.TECH_SUPPORT,
                Language.EN,
                "Tech Department",
                "Tech Support Specialist"
        );
    }

    public void viewNewOrders() {
        System.out.println("Просмотр новых заказов:");
        for (Orders order : orders) {
            System.out.println(order);
        }
    }

    public void acceptOrder(Orders order) {
        if (order != null) {
            System.out.println("Принят заказ: " + order.getId());
            orders.add(order);
        } else {
            System.out.println("Заказ не может быть null.");
        }
    }

    public void rejectOrder(Orders order) {
        if (order != null) {
            System.out.println("Отклонен заказ: " + order.getId());
            orders.remove(order);
        } else {
            System.out.println("Заказ не может быть null.");
        }
    }

    public void markOrderAsCompleted(Orders order) {
        if (order != null) {
            System.out.println("Заказ завершен: " + order.getId());
        } else {
            System.out.println("Заказ не может быть null.");
        }
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
