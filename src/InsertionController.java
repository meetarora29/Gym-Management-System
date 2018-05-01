import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class InsertionController {

    @FXML
    private AnchorPane ins_pane;


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
    void addEquip(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/ins_equip.fxml"));
        ins_pane.getChildren().setAll(pane);
    }

    @FXML
    void addExercise(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/ins_exercise.fxml"));
        ins_pane.getChildren().setAll(pane);
    }

    @FXML
    void addMember(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/ins_member.fxml"));
        ins_pane.getChildren().setAll(pane);

    }

    @FXML
    void addPlan(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/ins_plan.fxml"));
        ins_pane.getChildren().setAll(pane);
    }

    @FXML
    void addTrainer(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/ins_trainer.fxml"));
        ins_pane.getChildren().setAll(pane);
    }

    @FXML
    void clickBack(ActionEvent event) throws IOException {

        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        ins_pane.getChildren().setAll(pane);
    }

}
