import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class DispTrainerProfController {

    @FXML
    private AnchorPane disp_trainer_profit;

    @FXML
    private DatePicker lowerDate;

    @FXML
    private Button back;

    @FXML
    private Button done;

    @FXML
    private DatePicker upperDate;

    @FXML
    void clickBack(ActionEvent event) throws IOException {
        AnchorPane pane= FXMLLoader.load(getClass().getResource("fxml/disp_trainer.fxml"));
        disp_trainer_profit.getChildren().setAll(pane);
    }

    @FXML
    void clickDone(ActionEvent event) {
        LocalDate localDate = lowerDate.getValue();
        Instant instant = Instant.from(localDate.atStartOfDay(ZoneId.systemDefault()));
        Date date1 = Date.from(instant);

        LocalDate localDate1 = upperDate.getValue();
        Instant instant1 = Instant.from(localDate1.atStartOfDay(ZoneId.systemDefault()));
        Date date2 = Date.from(instant1);
        Query.print_proloss(date1,date2);
    }

}
