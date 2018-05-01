import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tooltip;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MainController {

    @FXML
    private AnchorPane mainpane;

    @FXML
    private Button done;

    @FXML
    private CheckBox ins_query;

    @FXML
    private CheckBox dis_query;

    @FXML
    private CheckBox del_query;

    @FXML
    void clickDone(ActionEvent event) throws IOException {
        AnchorPane pane;

        if(!(ins_query.isSelected()|| dis_query.isSelected() || del_query.isSelected() ))
        {
            System.out.println("None selected");
        }
        else if((ins_query.isSelected() && dis_query.isSelected()) || (del_query.isSelected() && dis_query.isSelected()) ||(ins_query.isSelected() && del_query.isSelected()))
        {
            System.out.println("Select One");
        }
        else if ((ins_query.isSelected() && dis_query.isSelected() && del_query.isSelected() ))
        {
            System.out.println("Select One");
        }
        else

        {
            if(ins_query.isSelected())

            {
                pane = FXMLLoader.load(getClass().getResource("fxml/insert_queries.fxml"));
            }
            else if(del_query.isSelected())
            {
                pane = FXMLLoader.load(getClass().getResource("fxml/del_queries.fxml"));
            }
            else
            {
                pane = FXMLLoader.load(getClass().getResource("fxml/display_queries.fxml"));
            }
            mainpane.getChildren().setAll(pane);
        }
    }


}
