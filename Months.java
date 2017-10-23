import javafx.stage.Stage;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import java.util.Optional;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.ComboBox;
import javafx.collections.ObservableList;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Button;


public class Months extends Application{
	@Override
	public void start(Stage primaryStage){
		//List of months
		ObservableList<String> options = FXCollections.observableArrayList("January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December");
		Label welcomeLabel = new Label ("select a month");
		//creation of the combobox
		ComboBox<String> combobox= new ComboBox<>(options);
		combobox.setValue("January");
		combobox.setOnAction(e ->{
			welcomeLabel.setText("you've chosen " + combobox.getValue());	
		
		});
		//Create exit button
		Button button = new Button("Exit");
		Button button2 = new Button("Run");
		button.setOnAction(e -> System.exit(0));
		FlowPane pane = new FlowPane();
		pane.getChildren().addAll(welcomeLabel, combobox, button, button2);
		Scene scene = new Scene(pane, 250, 250);
		primaryStage.setTitle("Season Gene");
		primaryStage.setScene(scene);
		


		button2.setOnAction( e ->{
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Season Gene");
			alert.setHeaderText("You are in the season of...");
	switch(combobox.getValue()){
		
		case "December":
		case "January":
		case "FebruarY":
			
			alert.setContentText("Lets build a snowman");
			alert.showAndWait();
			break;
		case "March":
		case "April":
		case "May":

			alert.setContentText("Happy spring days");
			alert.showAndWait();	
			break;
		case "June":
		case "July":
		case "August":

			alert.setContentText("It's summer time");
			alert.showAndWait();
			break;
		case "September":
		case "October":
		case "November":

			alert.setContentText("Welcome to the foliage season");
			alert.showAndWait();
			break;
				
			}
		});
			primaryStage.show();
	}
	
}
