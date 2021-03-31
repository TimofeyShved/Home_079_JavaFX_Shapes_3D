package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml")); // загрузка формы
        primaryStage.setTitle("Открытие 3D фигур"); // название
        primaryStage.setScene(new Scene(root, 400, 150)); // сцена и размеры
        primaryStage.show(); // отобразить

    }


    public static void main(String[] args) {
        launch(args);
    }
}
