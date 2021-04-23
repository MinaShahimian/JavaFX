package t3FX_LT1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class T3FX_LT1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		TextField txt1 = new TextField();
		txt1.prefWidth(100);
		txt1.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, 
				null, new BorderWidths(2))));
		Label lbl1 = new Label();

		TextField txt2 = new TextField();
		txt2.prefWidth(100);
		txt2.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, 
				null, new BorderWidths(2))));
		Label lbl2 = new Label();

		TextField txt3 = new TextField();
		txt3.prefWidth(100);
		Label lbl3 = new Label();

		GridPane gp = new GridPane();
		gp.setHgap(10);
		gp.setVgap(10);
		gp.setPadding(new Insets(5));
		gp.add(txt1, 0, 0);
		gp.add(lbl1, 1, 0);
		gp.add(txt2, 0, 1);
		gp.add(lbl2, 1, 1);
		gp.add(txt3, 0, 2);
		gp.add(lbl3, 1, 2);

		// eingabeteste
		txt1.setOnAction(e -> lbl1.setText(txt1.getText()));
		txt2.setOnAction(e -> lbl2.setText(txt2.getText()));
		txt3.setOnAction(e -> lbl3.setText(txt3.getText()));
		primaryStage.setScene(new Scene(gp));
		primaryStage.setTitle("T3FX_LT1");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
