import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class TodoItem {
    private final StringProperty task = new SimpleStringProperty();
    private final StringProperty status = new SimpleStringProperty();

    public TodoItem(String task, String status) {
        this.task.set(task);
        this.status.set(status);
    }

    public String getTask() {
        return task.get();
    }

    public void setTask(String task) {
        this.task.set(task);
    }

    public StringProperty taskProperty() {
        return task;
    }

    public String getStatus() {
        return status.get();
    }

    public void setStatus(String status) {
        this.status.set(status);
    }

    public StringProperty statusProperty() {
        return status;
    }
}