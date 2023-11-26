import javafx.application.Application;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        // Create sample objects
        Flight flight = new Flight("F123", "City A", "City B", "10:00", "12:00");
        Reservation reservation = new Reservation("John Doe", 30, "john.doe@example.com", flight);

    }
}
