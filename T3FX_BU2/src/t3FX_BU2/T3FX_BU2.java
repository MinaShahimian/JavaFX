package t3FX_BU2;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_BU2 extends Application {

	@Override
	public void start(Stage primaryStage) {

		ToggleGroup tg = new ToggleGroup();
		RadioButton rb1 = new RadioButton("RadioButton1");
		rb1.setToggleGroup(tg);
		RadioButton rb2 = new RadioButton("RadioButton2");
		rb2.setToggleGroup(tg);
		RadioButton rb3 = new RadioButton("RadioButton3");
		rb3.setToggleGroup(tg);

		Label lbl = new Label();
		lbl.setPrefWidth(200);

		tg.selectedToggleProperty().addListener(new ChangeListener<Toggle>() {

			@Override
			public void changed(ObservableValue<? extends Toggle> arg0, Toggle arg1, Toggle arg2) {

				if (rb1.isSelected())
					lbl.setText("RadioButton 1 ausgewählt");
				else if (rb2.isSelected())
					lbl.setText("RadioButton 2 ausgewählt");
				if (rb3.isSelected())
					lbl.setText("RadioButton 3 ausgewählt");

			}
		});

		VBox vb = new VBox(10, rb1, rb2, rb3, lbl);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb, 300, 200));
		primaryStage.setTitle("T3FX_BU2");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
