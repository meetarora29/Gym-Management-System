import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispTrainerProfController {

    @FXML
    private AnchorPane disp_trainer_profit;

    @FXML
    private DatePicker lowerDate;

    @FXML
    private Button back;

    @FXML
    private Button done;

    @FXML
    private DatePicker upperDate;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_trainer.fxml"));
        disp_trainer_profit.getChildren().setAll(pane);
    }

    @FXML
    void clickDone(ActionEvent event) {

    }

}
