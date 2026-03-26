import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class TodoController {

    @FXML
    private TextField taskField;

    @FXML
    private TableView<TodoItem> todoTable;

    @FXML
    private TableColumn<TodoItem, String> taskColumn;

    @FXML
    private TableColumn<TodoItem, String> statusColumn;

    private final ObservableList<TodoItem> todoList = FXCollections.observableArrayList();

    @FXML
    public void initialize() {
        taskColumn.setCellValueFactory(cellData -> cellData.getValue().taskProperty());
        statusColumn.setCellValueFactory(cellData -> cellData.getValue().statusProperty());

        todoTable.setItems(todoList);
    }

    @FXML
    private void handleAddTask() {
        String taskText = taskField.getText().trim();

        if (taskText.isEmpty()) {
            showAlert("Input Error", "Please enter a task.");
            return;
        }

        todoList.add(new TodoItem(taskText, "Pending"));
        taskField.clear();
    }

    @FXML
    private void handleDeleteTask() {
        TodoItem selectedTask = todoTable.getSelectionModel().getSelectedItem();

        if (selectedTask == null) {
            showAlert("Selection Error", "Please select a task to delete.");
            return;
        }

        todoList.remove(selectedTask);
    }

    @FXML
    private void handleMarkCompleted() {
        TodoItem selectedTask = todoTable.getSelectionModel().getSelectedItem();

        if (selectedTask == null) {
            showAlert("Selection Error", "Please select a task to mark as completed.");
            return;
        }

        selectedTask.setStatus("Completed");
        todoTable.refresh();
    }

    @FXML
    private void handleBack(ActionEvent event) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("landing.fxml"));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.show();
        } catch (IOException e) {
            System.err.println("Error: Could not load landing.fxml");
            e.printStackTrace();
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}