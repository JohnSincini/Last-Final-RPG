import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) {

        Label testo = new Label("Ciao JavaFX!");

        Scene scena = new Scene(testo, 400, 200);

        stage.setTitle("La mia prima finestra");
        stage.setScene(scena);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}