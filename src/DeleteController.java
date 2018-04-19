import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DeleteController {
    public String id;

    @FXML
    private AnchorPane del_pane;

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
        del_pane.getChildren().setAll(pane);

    }

    @FXML
    void delEquip(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/deletion.fxml"));
        del_pane.getChildren().setAll(pane);
        id="Equipment";
    }

    @FXML
    void delExercise(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/deletion.fxml"));
        del_pane.getChildren().setAll(pane);
        id="Exercise";
    }

    @FXML
    void delMember(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/deletion.fxml"));
        del_pane.getChildren().setAll(pane);
        id="Member";

    }

    @FXML
    void delPlan(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/deletion.fxml"));
        del_pane.getChildren().setAll(pane);
        id="Plan";
    }

    @FXML
    void delTrainer(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/deletion.fxml"));
        del_pane.getChildren().setAll(pane);
        id="Trainer";
    }

}
