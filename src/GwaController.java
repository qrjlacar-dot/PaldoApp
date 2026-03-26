import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class GwaController {

    @FXML
    public void initialize() {
        // This runs as soon as the GWA page opens.
        // Later, we can put code here to load saved grades!
    }

    @FXML
    private void handleBackToLanding(ActionEvent event) {
        try {
            // 1. Load the Landing page FXML
            Parent landingView = FXMLLoader.load(getClass().getResource("landing.fxml"));

            // 2. Get the current Scene (the one already showing)
            Scene currentScene = ((Node) event.getSource()).getScene();

            // 3. Swap the Root content to the Landing page
            // This keeps the window size/full-screen status exactly as it is!
            currentScene.setRoot(landingView);

        } catch (IOException e) {
            System.err.println("Error: Could not find landing.fxml!");
            e.printStackTrace();
        }
    }

    // You can add your "Add Subject" or "Calculate" methods below later!
}