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
import javafx.util.converter.CharacterStringConverter;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class InsertTrainerController {

    ObservableList<String> list= FXCollections.observableArrayList("Male","Female","Others");
    @FXML
    private AnchorPane add_trainer;

    @FXML
    private TextField age;

    @FXML
    private DatePicker date;

    @FXML
    private TextField salary;

    @FXML
    private TextField name;

    @FXML
    private ChoiceBox<String> gender;

    @FXML
    private Button add;

    @FXML
    private Button back;

    @FXML
    void clickAdd(ActionEvent event) {

        StringBuilder sb = new StringBuilder(name.getCharacters().length());
        StringBuilder sb1 = new StringBuilder(age.getCharacters().length());
        String s=sb1.append(age.getCharacters()).toString();
        LocalDate localDate = date.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date1 = Date.from(instant);
        Query.insert_trainer(sb.append(name.getCharacters()).toString(),Integer.parseInt(s),gender.getValue(),0,date1);

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
    @FXML
    void initialize() {
        gender.setItems(list);


    }

}
