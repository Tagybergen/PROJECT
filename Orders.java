/**
 * Class representing an Order.
 */
public class Orders {

    /**
     * Unique identifier for the order.
     */
    public String id;

    /**
     * Description of the order.
     */
    public String description;

    /**
     * Priority of the order.
     */
    public Urgency priority;

    /**
     * Default constructor.
     */
    public Orders() {
    }

    /**
     * Parameterized constructor.
     *
     * @param id          the unique ID of the order
     * @param description the description of the order
     * @param priority    the urgency level of the order
     */
    public Orders(String id, String description, Urgency priority) {
        this.id = id;
        this.description = description;
        this.priority = priority;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Urgency getPriority() {
        return priority;
    }

    public void setPriority(Urgency priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                ", priority=" + priority +
                '}';
    }
}
