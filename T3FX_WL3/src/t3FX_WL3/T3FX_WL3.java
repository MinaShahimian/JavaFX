package t3FX_WL3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;

public class T3FX_WL3 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label lb1 = new Label("Label1");
		Label lb2 = new Label("Label2");
		Label lb3 = new Label("Label3");
		Label lb4 = new Label("Label4");
		Label lb5 = new Label("Label5");
		Label lb6 = new Label("Label6");

		GridPane gp = new GridPane();
		gp.setHgap(100);
		gp.setVgap(100);
		gp.setPadding(new Insets(50));
		gp.add(lb1, 0, 0);
		gp.add(lb2, 1, 0);
		gp.add(lb3, 0, 1);
		gp.add(lb4, 1, 1);
		gp.add(lb5, 0, 2);
		gp.add(lb6, 1, 2);

		RowConstraints rc1 = new RowConstraints();
		rc1.setPercentHeight(0);

		RowConstraints rc2 = new RowConstraints();
		rc2.setPercentHeight(10);

		RowConstraints rc3 = new RowConstraints();
		rc3.setPercentHeight(30);
		gp.getRowConstraints().addAll(rc1, rc2, rc3);

		primaryStage.setScene(new Scene(gp,400,400));
		primaryStage.setTitle("T3FXWL3");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
