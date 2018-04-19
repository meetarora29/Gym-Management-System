import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class InsertPlanController {

    @FXML
    private AnchorPane add_plan;

    @FXML
    private TextField duration;

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
        add_plan.getChildren().setAll(pane);
    }

    @FXML
    void getCost(ActionEvent event) {

    }

    @FXML
    void getDuration(ActionEvent event) {

    }

    @FXML
    void getName(ActionEvent event) {

    }

}
