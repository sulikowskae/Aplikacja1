package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import java.awt.*;

public class Controller {

    public TextField text1;
    public TextField text2;
    public Label label;

    public void click(ActionEvent actionEvent) {

        label.setText(text1.getText() + text2.getText());
    }
}
