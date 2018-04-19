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

public class InsertMemController {

    ObservableList<String> list= FXCollections.observableArrayList("Male","Female","Others");

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
    private DatePicker date;

    @FXML
    private TextField name;

    @FXML
    private ChoiceBox<String> gender;

    @FXML
    void clickAdd(ActionEvent event) {
        Query q=new Query();
        StringBuilder sb = new StringBuilder(name.getCharacters().length());
        StringBuilder sb1 = new StringBuilder(age.getCharacters().length());
        StringBuilder sb2 = new StringBuilder(ph_num.getCharacters().length());
        StringBuilder sb3 = new StringBuilder(plan.getCharacters().length());
        StringBuilder sb4 = new StringBuilder(trainer.getCharacters().length());
        String s1=sb4.append(trainer.getCharacters()).toString();
        String s=sb1.append(age.getCharacters()).toString();
        LocalDate localDate = date.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date1 = Date.from(instant);

        q.insert_member(sb.append(name.getCharacters()).toString(),Integer.parseInt(s),gender.getValue(),sb2.append(ph_num.getCharacters()).toString(), sb3.append(plan.getCharacters()).toString(),Integer.parseInt(s1),date1);
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
    @FXML
    void initialize() {
        gender.setItems(list);
    }

}
