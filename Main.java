import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Load your landing page FXML
        Parent root = FXMLLoader.load(getClass().getResource("landing.fxml"));

        primaryStage.setTitle("Paldo App");
        primaryStage.setScene(new Scene(root));

        // THIS IS THE MAGIC LINE FOR FULL SCREEN!
        primaryStage.setMaximized(true);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
