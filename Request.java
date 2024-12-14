import java.util.Objects;

public class Request {
    public String requestDetails; // Детали запроса
    public Employee requestor;    // Кто сделал запрос
    public RequestStatus status;  // Статус запроса

    // Конструктор
    public Request(String requestDetails, Employee requestor, RequestStatus status) {
        this.requestDetails = requestDetails;
        this.requestor = requestor;
        this.status = status;
    }

    // Геттеры
    public String getRequestDetails() {
        return requestDetails;
    }

    public Employee getRequestor() {
        return requestor;
    }

    public RequestStatus getStatus() {
        return status;
    }

    // Сеттеры
    public void setRequestDetails(String requestDetails) {
        this.requestDetails = requestDetails;
    }

    public void setRequestor(Employee requestor) {
        this.requestor = requestor;
    }

    public void setStatus(RequestStatus status) {
        this.status = status;
    }

    // Метод для получения описания
    public String getDescription() {
        return "Request by " + requestor.getName() + ": " + requestDetails + " [Status: " + status + "]";
    }

    // Переопределение toString
    @Override
    public String toString() {
        return getDescription();
    }

    // Переопределение equals и hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Request request = (Request) o;
        return Objects.equals(requestDetails, request.requestDetails) &&
                Objects.equals(requestor, request.requestor) &&
                status == request.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestDetails, requestor, status);
    }
}
