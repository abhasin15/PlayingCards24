/**
 * This is the start of the main JavaFx Playing Cards 24 application
 * @Ayush
 */

 
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PlayingCardsDriver extends Application {
	public static void main(String[] args) 
	{
		//Start with main Class and give pass control to javafx start method
		launch(args); 
		//After this call now javafx is executing
	}
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent g=FXMLLoader.load(getClass().getResource("view/PlayingCardsGUI.fxml")); //makes connection to fxml file which is in views folder
		Scene sn=new Scene(g); // set scene 
		primaryStage.setScene(sn); // scene is sent to stage
		primaryStage.show(); // displays the scene on stage

	}
	
}
