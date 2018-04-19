import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispMemController {

    @FXML
    private AnchorPane disp_mem;

    @FXML
    private Button name;

    @FXML
    private Button name_age;

    @FXML
    private Button trainer;


    @FXML
    private Button mem;


    @FXML
    private Button beck;
    @FXML
    private Button count;


    @FXML
    void getCount(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_mem_count.fxml"));
        disp_mem.getChildren().setAll(pane);
    }
    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/display_queries.fxml"));
        disp_mem.getChildren().setAll(pane);
    }


    @FXML
    void getMem_plan_expire(ActionEvent event) {

    }

    @FXML
    void getMem_plan_update(ActionEvent event) {

    }

    @FXML
    void getName_Age(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_mem_age.fxml"));
        disp_mem.getChildren().setAll(pane);
    }



    @FXML
    void getNames(ActionEvent event) {

    }

    @FXML
    void getTrainer(ActionEvent event) {

    }



}
