import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispEquipBodyController {

    @FXML
    private AnchorPane disp_equip_machine;

    @FXML
    private Button done;

    @FXML
    private TextField lower_age;

    @FXML
    private Button back;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/disp_equip.fxml"));
        disp_equip_machine.getChildren().setAll(pane);
    }

    @FXML
    void clickDone(ActionEvent event) {

    }

}
