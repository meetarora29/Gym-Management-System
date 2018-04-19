import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DeleteEntryController {

    @FXML
    private AnchorPane delete_pane;

    @FXML
    private TextField id;

    @FXML
    private TextField name;

    @FXML
    private Button delete;

    @FXML
    private Button back;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/insert_queries.fxml"));
        delete_pane.getChildren().setAll(pane);
    }

    @FXML
    void clickDelete(ActionEvent event) {

    }

    @FXML
    void getId(ActionEvent event) {

    }

    @FXML
    void getName(ActionEvent event) {

    }

}
