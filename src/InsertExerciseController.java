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

public class InsertExerciseController {

    @FXML
    private AnchorPane add_exercise;

    @FXML
    private TextField body_part;

    @FXML
    private TextField name;

    @FXML
    private TextField Equipment;

    @FXML
    private Button add;

    @FXML
    private Button back;

    @FXML
    void clickAdd(ActionEvent event) {

        Query q=new Query();
        StringBuilder sb = new StringBuilder(name.getCharacters().length());
        StringBuilder sb1 = new StringBuilder(body_part.getCharacters().length());
        StringBuilder sb2 = new StringBuilder(Equipment.getCharacters().length());
        String s=sb1.append(body_part.getCharacters()).toString();
        String s1=sb2.append(Equipment.getCharacters()).toString();


        q.insert_exercise(sb.append(name.getCharacters()).toString(),s,s1);
    }

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/insert_queries.fxml"));
        add_exercise.getChildren().setAll(pane);
    }

    @FXML
    void getBodyPart(ActionEvent event) {

    }

    @FXML
    void getEquipment(ActionEvent event) {

    }

    @FXML
    void getName(ActionEvent event) {

    }

}
