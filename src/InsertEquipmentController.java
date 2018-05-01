import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class InsertEquipmentController {

    ObservableList<String> list= FXCollections.observableArrayList("In Use","In Maintainence");
    @FXML
    private AnchorPane add_equipment;

    @FXML
    private DatePicker date;

    @FXML
    private ChoiceBox<String> status;

    @FXML
    private TextField bodypart;

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
        StringBuilder sb1 = new StringBuilder(cost.getCharacters().length());
        StringBuilder sb2 = new StringBuilder(bodypart.getCharacters().length());
        String s=sb1.append(cost.getCharacters()).toString();
        LocalDate localDate = date.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date1 = Date.from(instant);

        Query.insert_equipment(sb.append(name.getCharacters()).toString(),date1,Integer.parseInt(s),sb2.append(bodypart.getCharacters()).toString(), status.getValue());
    }
    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/insert_queries.fxml"));
        add_equipment.getChildren().setAll(pane);
    }

    @FXML
    void getBodyPart(ActionEvent event) {

    }

    @FXML
    void getCost(ActionEvent event) {

    }

    @FXML
    void getName(ActionEvent event) {

    }

    @FXML
    void getPurchased(ActionEvent event) {

    }

    @FXML
    void getStatus(ActionEvent event) {

    }
    @FXML
    void initialize(){

        status.setItems(list);

    }

}
