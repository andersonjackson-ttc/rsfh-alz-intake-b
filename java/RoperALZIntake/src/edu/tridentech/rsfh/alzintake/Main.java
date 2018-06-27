package edu.tridentech.rsfh.alzintake;

import java.util.List;

import edu.tridentech.rsfh.alzintake.view.FXMLDocumentController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage stage) throws Exception {
	    FXMLDocumentController controller;
	    FXMLLoader loader = new FXMLLoader(getClass().getResource("rsfhCbriArcIntakeForm1.0.fxml"));
	    Parent root = loader.load();

	    List<String> args = this.getParameters().getRaw();
	    // default is here
		String filePath = "RoperSpreadsheet2.xlsx";

		// read path from the command line
		if (args.size() > 0) {
			filePath = args.get(0);
		}

		Scene scene = new Scene(root);
		scene.getStylesheets().add(Main.class.getClassLoader().getResource("RoperIntake.css").toExternalForm());
		controller = (FXMLDocumentController)loader.getController();
		controller.setFilePath(filePath);

		stage.setTitle("Patient Intake Pre-Screen Form");
		stage.setScene(scene);
		stage.show();
}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
