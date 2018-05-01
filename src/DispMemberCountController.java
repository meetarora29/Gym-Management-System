import javafx.beans.binding.Bindings;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispMemberCountController {

    ObservableList<String> list= FXCollections.observableArrayList("Male","Female","Others");
    @FXML
    private AnchorPane disp_mem_count;

    @FXML
    private Button done;
    @FXML
    private Slider upperAge;

    @FXML
    private Slider lowerAge;

    @FXML
    private Label upper;

    @FXML
    private Label lower;

    @FXML
    private Button back;

    @FXML
    private ChoiceBox<String> gender;

    @FXML
    void clickDone(ActionEvent event) {

        Query.count_by_sex((int)lowerAge.getValue(),(int)upperAge.getValue());
    }

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_member.fxml"));
        disp_mem_count.getChildren().setAll(pane);
    }


    @FXML
    void initialize(){
        gender.setItems(list);
        gender.setValue("Select Gender");
        gender.setTooltip(new Tooltip("Select Gender"));
        lowerAge.setMin(0);
        lowerAge.setMax(120);
        upperAge.setMax(120);
        upperAge.setMin(0);
        lower.textProperty().bind(
                Bindings.format(
                        "%.2f",
                        lowerAge.valueProperty()
                )
        );

        upper.textProperty().bind(
                Bindings.format(
                        "%.2f",
                        upperAge.valueProperty()
                )
        );

    }

}
