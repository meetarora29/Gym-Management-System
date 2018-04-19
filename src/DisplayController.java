import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DisplayController {

    @FXML
    private AnchorPane dis_pane;

    @FXML
    private Button member;

    @FXML
    private Button trainer;

    @FXML
    private Button equip;

    @FXML
    private Button plan;

    @FXML
    private Button exer;

    @FXML
    private Button back;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        dis_pane.getChildren().setAll(pane);
    }

    @FXML
    void disEquip(ActionEvent event) {

    }

    @FXML
    void disExercise(ActionEvent event) {

    }

    @FXML
    void disMember(ActionEvent event) {

    }

    @FXML
    void disPlan(ActionEvent event) {

    }

    @FXML
    void disTrainer(ActionEvent event) {

    }

}
