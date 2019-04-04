import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class PlayingCardsDriver extends Application {
	public static void main(String[] args) 
	{
		System.out.println("Hello");
		System.out.println("Hello Luc");
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent g=FXMLLoader.load(getClass().getResource("GUI.fxml")); //makes connection to fxml file
		Scene sn=new Scene(g); // set scene 
		primaryStage.setScene(sn); // scene is sent to stage
		primaryStage.show(); // displays the scene on stage

		
	}
}
