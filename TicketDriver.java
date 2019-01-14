/**
@auther Walker Lewery 3617181
*/
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.event.ActionEvent;
import java.text.*;
import javafx.geometry.Pos;
public class TicketDriver extends Application{
	private Button firstClassButt,econButt,resetButt;
	private TextField passName,numOfDrinks,numOfBags;
	private Label message,message2,nameLabel,bagLabel,drinksLabel;

	public void start (Stage stage){
		stage.setTitle("Ticket Calculator");
	
		//buttons 
		firstClassButt = new Button("First Class");
		firstClassButt.setOnAction(this::eventHandler);
		econButt = new Button("Economy");
		econButt.setOnAction(this::eventHandler);
		resetButt = new Button("Reset");
		resetButt.setOnAction(this::eventHandler);
	
		//Text Fields
		passName = new TextField();
		numOfDrinks = new TextField();
		numOfDrinks.setPrefWidth(40);
		numOfBags = new TextField();
		numOfBags.setPrefWidth(40);

		//Label
		message = new Label("Welcome to Flights R Us!");
		message2 = new Label("Enter your ticket information.");
		nameLabel = new Label("Passenger Name: ");
		bagLabel = new Label("Number of Checked Bags: ");
		drinksLabel = new Label("Number of in-flight Drinks: ");

		//FlowPane
		FlowPane myPane = new FlowPane(nameLabel,passName,bagLabel,numOfBags,drinksLabel,numOfDrinks,econButt,firstClassButt,resetButt,message,message2);
	
		myPane.setHgap(20);
		myPane.setVgap(20);
		myPane.setAlignment(Pos.CENTER);

		Scene myScene = new Scene(myPane,320,300);
			
		stage.setScene(myScene);
		stage.show();	


	}

	public void eventHandler(ActionEvent event){
		NumberFormat df = new DecimalFormat();
		df.setMaximumFractionDigits(2);	
		df.setMinimumFractionDigits(2);
		if(event.getSource()==firstClassButt){
			FirstClassTicket FirstClassTicket = new FirstClassTicket(passName.getText(),Integer.parseInt(numOfBags.getText()),Integer.parseInt(numOfDrinks.getText()));
			message.setText("Boarding Group Number: "+FirstClassTicket.getBoardingGroup());
			message2.setText("Total cost of flight: $"+FirstClassTicket.calculateFees());
		}

		else if(event.getSource()==econButt){
			EconomyTicket EconomyTicket = new EconomyTicket(passName.getText(),Integer.parseInt(numOfBags.getText()),Integer.parseInt(numOfDrinks.getText()));
			message.setText("Boarding Group Number: "+EconomyTicket.getBoardingGroup());
			message2.setText("Total cost of flight: $"+EconomyTicket.calculateFees());
		}
		
		else if(event.getSource()==resetButt){
			message.setText("Welcome to Flights R Us!");
			message2.setText("Enter your ticket information.");
			passName.setText("");
			numOfDrinks.setText("");
			numOfBags.setText("");

		}

	}
}
