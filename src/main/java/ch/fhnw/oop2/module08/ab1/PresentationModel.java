package ch.fhnw.oop2.module08.ab1;

import javafx.beans.property.SimpleStringProperty;

public class PresentationModel {
    SimpleStringProperty appTitle;
    SimpleStringProperty buttonText;

    public PresentationModel() {
        this.appTitle = new SimpleStringProperty("JavaFX Application");
        this.buttonText = new SimpleStringProperty("Hello World!");
    }

    public String getAppTitle() {
        return appTitle.get();
    }

    public SimpleStringProperty appTitleProperty() {
        return appTitle;
    }

    public void setAppTitle(String appTitle) {
        this.appTitle.set(appTitle);
    }

    public String getButtonText() {
        return buttonText.get();
    }

    public SimpleStringProperty buttonTextProperty() {
        return buttonText;
    }

    public void setButtonText(String buttonText) {
        this.buttonText.set(buttonText);
    }
}
