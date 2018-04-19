import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

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

        StringBuilder sb = new StringBuilder(name.getCharacters().length());
        StringBuilder sb1 = new StringBuilder(duration.getCharacters().length());
        StringBuilder sb4 = new StringBuilder(cost.getCharacters().length());
        String s1=sb4.append(cost.getCharacters()).toString();
        String s=sb1.append(duration.getCharacters()).toString();
        Query.insert_plan(sb.append(name.getCharacters()).toString(),Integer.parseInt(s),Integer.parseInt(s1));
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
