package dad.calculadoraFXML.App;

import dad.calculadoraFXML.controller.Controller;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private Controller controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		controller = new Controller();
		
		Scene scene = new Scene(controller.getRoot());
		primaryStage.setScene(scene);
		primaryStage.setTitle("Calculadora FXML \t");
		primaryStage.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
