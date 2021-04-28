package t3FX_C3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class T3FX_C3 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label lbl = new Label("Wählen Sie das Format der Datumsanzeige aus.");


		ComboBox<String> cb = new ComboBox<>(FXCollections.observableArrayList("vollStändig", "lang", "kurz"));
		
		
		Label lbltxt = new Label();
		lbltxt.setStyle("-fx-text-fill: Green");
		lbltxt.setFont(Font.font(20));

		cb.setPrefWidth(200);
		cb.setVisibleRowCount(3);
		cb.getSelectionModel().select(0);


		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				switch (arg2) {
				case "vollStändig":
					lbltxt.setText(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));
					break;
				case "lang":
					lbltxt.setText(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG)));
					break;
				case "kurz":
					lbltxt.setText(LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)));
					break;
				}
			}

		});

		VBox vb = new VBox(10, lbl, cb, lbltxt);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb, 300, 200));
		primaryStage.setTitle("T3FX_C3");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
