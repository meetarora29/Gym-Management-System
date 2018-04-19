import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class InsertEquipmentController {

    @FXML
    private AnchorPane add_equipment;

    @FXML
    private TextField purchased;

    @FXML
    private TextField status;

    @FXML
    private TextField bodypart;

    @FXML
    private TextField name;

    @FXML
    private TextField cost;

    @FXML
    private Button add;

    @FXML
    private Button back;

    @FXML
    void clickAdd(ActionEvent event) {

    }

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/insert_queries.fxml"));
        add_equipment.getChildren().setAll(pane);
    }

    @FXML
    void getBodyPart(ActionEvent event) {

    }

    @FXML
    void getCost(ActionEvent event) {

    }

    @FXML
    void getName(ActionEvent event) {

    }

    @FXML
    void getPurchased(ActionEvent event) {

    }

    @FXML
    void getStatus(ActionEvent event) {

    }

}
