package ch.fhnw.oop2.module08.ab2;

import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;

public class PresentationModel {
    public enum ButtonState {
        OFF("Off"), ON("On");

        public final String state;

        ButtonState(String state) {
            this.state = state;
        }
    }

    SimpleStringProperty appTitle;
    SimpleObjectProperty buttonText;

    public PresentationModel() {
        this.appTitle = new SimpleStringProperty("Toggle Application");
        this.buttonText = new SimpleObjectProperty(ButtonState.OFF.state);
    }


    public void toggle() {
        if (this.getButtonText().equals(ButtonState.OFF.state)) {
            buttonTextProperty().setValue(ButtonState.ON.state);
        } else {
            buttonTextProperty().setValue(ButtonState.OFF.state);
        }
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

    public Object getButtonText() {
        return buttonText.get();
    }

    public SimpleObjectProperty buttonTextProperty() {
        return buttonText;
    }

    public void setButtonText(Object buttonText) {
        this.buttonText.set(buttonText);
    }

    public void setButtonText(String buttonText) {
        this.buttonText.set(buttonText);
    }
}
