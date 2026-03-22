import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.io.IOException;

public class MainController {

    @FXML
    public void handleButtonClick(ActionEvent event) throws IOException {
        System.out.println("Button clicked! Redirecting...");

        // This is the logic that "redirects" the user
        // For now, it just prints to the console because we only have one page
    }
}
