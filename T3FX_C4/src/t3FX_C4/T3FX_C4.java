package t3FX_C4;

import java.net.URI;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_C4 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label lbl1 = new Label("Wählen sie der Hundenrasse aus");
		ComboBox<String> cb = new ComboBox<>();
		cb.setItems(FXCollections.observableArrayList("French_Buldog", "Husky", "Petra"));
		//cb.getSelectionModel().select(0);

		Label lblBild = new Label();

		cb.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				switch (arg2) {
				case "French_Buldog":
					URI uri1 = Paths.get("C:\\Java\\French_Buldog.jfif").toUri();
					ImageView iv1 = new ImageView(uri1.toString());
					iv1.setPreserveRatio(true);
					iv1.setFitWidth(200);
					lblBild.setGraphic(iv1);
					break;
				case "Husky":
					URI uri2 = Paths.get("C:\\Java\\Husky.jfif").toUri();
					ImageView iv2 = new ImageView(uri2.toString());
					iv2.setPreserveRatio(true);
					iv2.setFitWidth(200);
					lblBild.setGraphic(iv2);
					break;
				case "Petra":
					URI uri3 = Paths.get("C:\\Java\\Petra.jfif").toUri();
					ImageView iv3 = new ImageView(uri3.toString());
					iv3.setPreserveRatio(true);
					iv3.setFitWidth(300);
					lblBild.setGraphic(iv3);
					break;

				default:
					break;
				}
			}

		});


		VBox vb = new VBox(10, lbl1, cb, lblBild);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb,400,400));
		primaryStage.setTitle("");
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
