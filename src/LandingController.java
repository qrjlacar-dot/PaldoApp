import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;

public class LandingController {

    @FXML
    private void handleExpensesClick(ActionEvent event) {
        switchScene(event, "ExpensesTracker.fxml");
    }

    @FXML
    private void handleGWAClick(ActionEvent event) {
        switchScene(event, "gwa.fxml");
    }

    // This helper method saves you from repeating the same code!
    private void switchScene(ActionEvent event, String fxmlFile) {
        try {
            Parent view = FXMLLoader.load(getClass().getResource(fxmlFile));
            Scene currentScene = ((Node)event.getSource()).getScene();
            currentScene.setRoot(view);
        } catch (IOException e) {
            System.err.println("Error loading " + fxmlFile);
            e.printStackTrace();
        }
    }
}