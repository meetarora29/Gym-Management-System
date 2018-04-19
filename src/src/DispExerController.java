import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispExerController {

    @FXML
    private AnchorPane disp_exercise;

    @FXML
    private Button name;



    @FXML
    private Button back;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/display_queries.fxml"));
        disp_exercise.getChildren().setAll(pane);
    }


    @FXML
    void getNames(ActionEvent event) {

    }

}
