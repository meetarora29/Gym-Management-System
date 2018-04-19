import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class InsertTrainerController {

    @FXML
    private AnchorPane add_trainer;

    @FXML
    private TextField age;

    @FXML
    private TextField last_paid;

    @FXML
    private TextField salary;

    @FXML
    private TextField name;

    @FXML
    private TextField gender;

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
        add_trainer.getChildren().setAll(pane);
    }

    @FXML
    void getAge(ActionEvent event) {

    }

    @FXML
    void getGender(ActionEvent event) {

    }

    @FXML
    void getName(ActionEvent event) {

    }

    @FXML
    void getPaid(ActionEvent event) {

    }

    @FXML
    void getSalary(ActionEvent event) {

    }

}
