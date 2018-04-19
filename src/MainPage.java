

import com.sun.xml.internal.bind.v2.TODO;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundImage;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class MainPage extends Application {

    public static Stage window;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Query q=Query.getInstance();
        window=primaryStage;
        window.setTitle("Body Mechanics");
//        window.setResizable(false);//the window is not resizable, it would remzain of the same size.



//        pane.setBackground(new Background(image));
        AnchorPane root = FXMLLoader.load(getClass().getResource("fxml/main.fxml"));
        Scene scene1=new Scene(root);
        window.setScene(scene1);
        window.show();
//        MainController.welcome_screen();
    }




    public static void main(String[] args) {
        launch(args);
    }
}
