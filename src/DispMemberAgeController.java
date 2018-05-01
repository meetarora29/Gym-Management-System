import javafx.beans.binding.Bindings;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispMemberAgeController {

    @FXML
    private AnchorPane disp_mem_age;

    @FXML
    private Button done;



    @FXML
    private Button back;

    @FXML
    private Slider upperAge;

    @FXML
    private Slider lowerAge;

    @FXML
    private Label upper;

    @FXML
    private Label lower;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_member.fxml"));
        disp_mem_age.getChildren().setAll(pane);
    }

    @FXML
    void clickDone(ActionEvent event) {
        Query.print_in_age_group("Members",(int)lowerAge.getValue(),(int)upperAge.getValue());
    }

    @FXML
    void initialize(){

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
