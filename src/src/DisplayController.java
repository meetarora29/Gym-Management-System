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
    void disEquip(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_equip.fxml"));
        dis_pane.getChildren().setAll(pane);
    }

    @FXML
    void disExercise(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_exercise.fxml"));
        dis_pane.getChildren().setAll(pane);
    }

    @FXML
    void disMember(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_member.fxml"));
        dis_pane.getChildren().setAll(pane);
    }

    @FXML
    void disPlan(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_plan.fxml"));
        dis_pane.getChildren().setAll(pane);
    }

    @FXML
    void disTrainer(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_trainer.fxml"));
        dis_pane.getChildren().setAll(pane);
    }

}
