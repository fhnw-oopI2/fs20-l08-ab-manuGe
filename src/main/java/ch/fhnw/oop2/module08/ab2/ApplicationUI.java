package ch.fhnw.oop2.module08.ab2;

import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox {
    private Button button;
    private PresentationModel pm;
    
    public ApplicationUI(PresentationModel pm) {
        this.pm = pm;
        initializeControls();
        layoutControls();
    }

    private void initializeControls() {
        button = new Button();
        button.textProperty().bindBidirectional(pm.buttonTextProperty());
        button.setOnAction(action -> pm.toggle());
    }

    private void layoutControls() {
        setAlignment(Pos.CENTER);
        getChildren().add(button);
    }
}
