import javafx.beans.binding.Bindings;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.AnchorPane;

import javax.swing.event.ChangeListener;
import java.io.IOException;

public class DispPlanBudgetController {

    @FXML
    private AnchorPane disp_plan_budget;

    @FXML
    private Button back;

    @FXML
    private Label label;

    @FXML
    private Button Done;

    @FXML
    private Slider budget_slider;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/disp_plan.fxml"));
        disp_plan_budget.getChildren().setAll(pane);
    }

    @FXML
    void clickDone(ActionEvent event)
    {
        Query.print_budget_plans((int)budget_slider.getValue());
    }
    @FXML


    void initialize() {

        budget_slider.setMin(0);
        budget_slider.setMax(24000);
        label.textProperty().bind(
                Bindings.format(
                        "%.2f",
                        budget_slider.valueProperty()
                )
        );

//        budget_slider.

    }

}
