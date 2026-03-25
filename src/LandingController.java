import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LandingController {

    @FXML
    private void handleExpensesClick(ActionEvent event) {
        try {
            Parent expensesView = FXMLLoader.load(getClass().getResource("ExpensesTracker.fxml"));
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(new Scene(expensesView));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Could not find ExpensesTracker.fxml");
            e.printStackTrace();
        }
    }

    @FXML
    private void handleTodoClick(ActionEvent event) {
        try {
            Parent todoView = FXMLLoader.load(getClass().getResource("todo.fxml"));
            Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();
            window.setScene(new Scene(todoView));
            window.show();
        } catch (IOException e) {
            System.err.println("Error: Could not find todo.fxml");
            e.printStackTrace();
        }
    }
}