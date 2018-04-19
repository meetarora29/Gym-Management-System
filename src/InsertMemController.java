import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class InsertMemController {


    @FXML
    private AnchorPane add_mem;
    @FXML
    private Button add;
    @FXML
    private Button back;
    @FXML
    private TextField age;

    @FXML
    private TextField plan;

    @FXML
    private TextField trainer;

    @FXML
    private TextField ph_num;

    @FXML
    private TextField mem_since;

    @FXML
    private TextField name;

    @FXML
    private TextField gender;

    @FXML
    void clickAdd(ActionEvent event) {

    }
    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/insert_queries.fxml"));
        add_mem.getChildren().setAll(pane);
    }
    @FXML
    void getAge(ActionEvent event) {

    }

    @FXML
    void getGender(ActionEvent event) {

    }

    @FXML
    void getMemSince(ActionEvent event) {

    }

    @FXML
    void getName(ActionEvent event) {

    }

    @FXML
    void getNum(ActionEvent event) {

    }

    @FXML
    void getPlan(ActionEvent event) {

    }

    @FXML
    void getTrainer(ActionEvent event) {

    }

}
