package t3FX_BL1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.converter.NumberStringConverter;

public class T3FX_BL1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Hund h = new Hund("Rex", 4);
		Label lblName = new Label("Name");
		lblName.setPrefWidth(100);
		TextField txtName = new TextField();
		txtName.setPrefWidth(150);
		HBox hbName = new HBox(10, lblName, txtName);
		hbName.setPadding(new Insets(5));

		Label lblAlter = new Label("Alter");
		lblAlter.setPrefWidth(100);
		TextField txtAlter = new TextField();
		txtAlter.setPrefWidth(150);
		HBox hbAlter = new HBox(10, lblAlter, txtAlter);
		hbAlter.setPadding(new Insets(5));

		Button alter = new Button("Alter verdoppeln");

		// verbindung
		// der nameProperty

		txtName.textProperty().bindBidirectional(h.nameProperty());
		txtAlter.textProperty().bindBidirectional(h.alterProperty(), new NumberStringConverter());

		alter.setOnAction(e -> h.setAlter(h.getAlter()*2 ));

		VBox vb = new VBox(10, hbName, hbAlter, alter);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb));
		primaryStage.setTitle("T3FX_BL1");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
