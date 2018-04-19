import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispPlanController {

    @FXML
    private AnchorPane disp_plans;

    @FXML
    private Button plans;

    @FXML
    private Button budget;

    @FXML
    private Button back;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/display_queries.fxml"));
        disp_plans.getChildren().setAll(pane);
    }

    @FXML
    void getBudget(ActionEvent event) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("fxml/disp_plan_budget.fxml"));
        disp_plans.getChildren().setAll(pane);
    }

    @FXML
    void getPlans(ActionEvent event) {

    }

}
