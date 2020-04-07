package ch.fhnw.oop2.module08.ab1;

import javafx.application.Application;
import javafx.beans.binding.Bindings;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

    @Override
    public void start(Stage primaryStage) {
        PresentationModel pm = new PresentationModel();

        Parent rootPanel = new ApplicationUI(pm);

        Scene scene = new Scene(rootPanel);

        primaryStage.setTitle(pm.getAppTitle());
        primaryStage.setScene(scene);

        primaryStage.setWidth(300);
        primaryStage.setHeight(300);
        primaryStage.centerOnScreen();

        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}
