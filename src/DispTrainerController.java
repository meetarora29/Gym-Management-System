import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DispTrainerController {

    @FXML
    private AnchorPane disp_trainer;

    @FXML
    private Button name;

    @FXML
    private Button salary;

    @FXML
    private Button profit;

    @FXML
    private Button back;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/display_queries.fxml"));
        disp_trainer.getChildren().setAll(pane);
    }

    @FXML
    void getNames(ActionEvent event)
    {
        Query.print_all("Trainers");
    }

    @FXML
    void getProfit(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_trainer_profit.fxml"));
        disp_trainer.getChildren().setAll(pane);
    }

    @FXML
    void getSalary(ActionEvent event) {
        Query.print_total_salary_to_give();

    }

}
