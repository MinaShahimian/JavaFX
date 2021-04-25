package t3FX_BU3;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_BU3 extends Application {

	@Override
	public void start(Stage primaryStage) {

		CheckBox cb1 = new CheckBox("CheckBox 1");
		CheckBox cb2 = new CheckBox("CheckBox 2");

		//true hat 2 variante (isSelected) und (isIndeterminate)
		//false kann man nur (isSelected) auswählen.
		cb1.setAllowIndeterminate(false);
		cb2.setAllowIndeterminate(true);

		HBox hb=new HBox(cb1,cb2);
		hb.setPadding(new Insets(10));
		
		TextField txt = new TextField();
		txt.setPrefWidth(100);
		TextField txt2 = new TextField();
		txt.setPrefWidth(100);
		
		cb1.setOnAction(e -> {
			txt.clear();
			txt2.clear();

			if (cb1.isSelected())
				txt.setText("CheckBox 1 ausgewählt");
			if(cb1.isIndeterminate())
				txt.setText("CheckBox 1 is Indeterminate");
//			if (cb2.isSelected())
//				txt2.appendText("CheckBox 2 ausgewählt");
//			if(cb2.isIndeterminate())
//				txt2.appendText("CheckBox 2 is Indeterminate");
			
		});
		cb2.setOnAction(e -> {
			txt.clear();
			txt2.clear();

//			if (cb1.isSelected())
//				txt.setText("CheckBox 1 ausgewählt");
//			if(cb1.isIndeterminate())
//				txt.setText("CheckBox 1 is Indeterminate");
			if (cb2.isSelected())
				txt2.appendText("CheckBox 2 ausgewählt");
			if(cb2.isIndeterminate())
				txt2.appendText("CheckBox 2 is Indeterminate");
			
		});

		VBox vb = new VBox(10,hb, txt,txt2);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb, 300, 200));
		primaryStage.setTitle("T3FX_BU3");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
