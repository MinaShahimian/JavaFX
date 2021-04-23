package t3FX_HV1;

import java.net.URI;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_HV1 extends Application {

	@Override
	public void start(Stage primaryStage) {

		Label lbl1 = new Label("Name");
		lbl1.setPrefWidth(100);
		Label lblName = new Label("Nico Rosberg");
		HBox hbName = new HBox(10, lbl1, lblName);
		hbName.setPadding(new Insets(5));

		Label lbl2 = new Label("Team");
		lbl2.setPrefWidth(100);
		Label lblTeam = new Label("Mercedes");
		HBox hbTeam = new HBox(10, lbl2, lblTeam);
		hbTeam.setPadding(new Insets(5));

		Label lbl3 = new Label("Auto");
		lbl3.setPrefWidth(100);
		Label lblBild = new Label();
		lblBild.setPrefWidth(300);
		
		URI uri = Paths.get("C:\\Java\\Mercedes.jfif").toUri();
		ImageView iv = new ImageView(uri.toString());
		//iv.setPreserveRatio(true);
		iv.setFitWidth(300);
		lblBild.setGraphic(iv);
		HBox hbBild = new HBox(10, lbl3, lblBild);
		hbBild.setPadding(new Insets(5));

		VBox vb = new VBox(10, hbName, hbTeam, hbBild);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb));
		primaryStage.setTitle("T3FX_HV1");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
