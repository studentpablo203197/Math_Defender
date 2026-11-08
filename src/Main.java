import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public void start(Stage primaryStage) {
        primaryStage.setTitle("Math Defender");

        // Tymczasowy przycisk startowy
        Button btn = new Button("Uruchom grę");
        btn.setOnAction(e -> System.out.println("Kliknięto menu!"));

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        // Tworzenie sceny o wymiarach 1280x720
        Scene scene = new Scene(root, 1280, 720);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.show();
    }

    static void main(String[] args) {
        launch(args);
    }
}