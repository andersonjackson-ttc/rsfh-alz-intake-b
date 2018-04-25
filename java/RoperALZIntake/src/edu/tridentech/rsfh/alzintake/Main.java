package edu.tridentech.rsfh.alzintake;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage stage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("rsfhCbriArcIntakeForm.fxml"));
	    // Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("mainWindow.fxml"));

	        Scene scene = new Scene(root);
	     scene.getStylesheets().add(Main.class.getClassLoader().getResource("RoperIntake.css").toExternalForm());
	        stage.setTitle("Patient Intake Pre-Screen Form");
	        stage.setScene(scene);
	        stage.show();
	}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
