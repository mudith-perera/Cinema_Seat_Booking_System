import javafx.application.Application;
import javafx.stage.Stage;

public class CinemaHall extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        GuiFunctions guiFunctions = new GuiFunctions();
        //guiFunctions.logIn();
        guiFunctions.mainMenu();
        //comment

    }
    public static void main(String [] cake){
        launch();
    }
}
