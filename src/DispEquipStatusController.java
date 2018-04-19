import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispEquipStatusController {

    ObservableList<String> list= FXCollections.observableArrayList("In Use","In Maintainence");
    @FXML
    private AnchorPane equip_status;

    @FXML
    private ChoiceBox<String> status;

    @FXML
    private Button done;

    @FXML
    private Button back;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/disp_equip.fxml"));
        equip_status.getChildren().setAll(pane);
    }

    @FXML
    void clickDone(ActionEvent event) {

    }

    @FXML
    void initialize() {
        status.setItems(list);

    }
}
