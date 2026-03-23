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
            // This loads your second FXML file
            Parent expensesView = FXMLLoader.load(getClass().getResource("ExpensesTracker.fxml"));

            // This gets the current window (Stage)
            Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();

            // This replaces the "Landing" scene with the "Expenses" scene
            window.setScene(new Scene(expensesView));
            window.show();

        } catch (IOException e) {
            System.err.println("Error: Could not find ExpensesTracker.fxml. Make sure the filename matches exactly!");
            e.printStackTrace();
        }
    }
}

//helo