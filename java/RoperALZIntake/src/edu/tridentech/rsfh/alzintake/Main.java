package edu.tridentech.rsfh.alzintake;

import java.io.File;
import java.util.List;

import edu.tridentech.rsfh.alzintake.view.FXMLDocumentController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class Main extends Application {

	public void start(Stage stage) throws Exception {
	    FXMLDocumentController controller;
 	    FXMLLoader loader = new FXMLLoader(getClass().getResource("rsfhCbriArcIntakeForm1.0.fxml"));
	    // uncomment for shipping to Roper
	    // FXMLLoader loader = new FXMLLoader(getClass().getResource("/src/edu/tridentech/rsfh/alzintake/rsfhCbriArcIntakeForm1.0.fxml"));
	    Parent root = loader.load();

	    List<String> args = this.getParameters().getRaw();
	    // default is here
		String filePath = "RoperSpreadsheet2.xlsx";

		// read path from the command line
		if (args.size() > 0) {
			filePath = args.get(0);
		}
		
		File file = new File(filePath);
		if (!file.exists()) {
			String msg = String.format("Spreadsheet not found at %s", filePath);
			new Alert(AlertType.ERROR, msg).showAndWait();
			return;
		}

		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("RoperIntake.css").toExternalForm());
	    // uncomment for shipping to Roper
		// scene.getStylesheets().add(getClass().getResource("/src/edu/tridentech/rsfh/alzintake/RoperIntake.css").toExternalForm());
		controller = (FXMLDocumentController)loader.getController();

		if (controller == null) {
			new Alert(AlertType.ERROR, "FXML file not found").showAndWait();
			return;
		}
		controller.setFilePath(filePath);

		stage.setTitle("Patient Intake Pre-Screen Form");
		stage.setScene(scene);
		stage.show();
}

	public static void main(String[] args) {
		Application.launch(args);
	}

}
