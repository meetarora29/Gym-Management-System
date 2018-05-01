import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispEquipController {

    @FXML
    private AnchorPane disp_equip;

    @FXML
    private Button name;

    @FXML
    private Button status;

    @FXML
    private Button money_spent;

    @FXML
    private Button usedfor;

    @FXML
    private Button back;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/display_queries.fxml"));
        disp_equip.getChildren().setAll(pane);
    }



    @FXML
    void getNames(ActionEvent event) {
        Query.print_all("Equipment");
    }

    @FXML
    void getStatus(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/disp_equip_status.fxml"));
        disp_equip.getChildren().setAll(pane);

    }

    @FXML
    void getUsedFor(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/disp_equip_machine.fxml"));
        disp_equip.getChildren().setAll(pane);
    }

}
