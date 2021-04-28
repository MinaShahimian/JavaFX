package t3FX_C1;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextField;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class T3FX_C1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		ObservableList<ColorData> ol = FXCollections.observableArrayList();
		ol.add(new ColorData("Gary", Color.GRAY));
		ol.add(new ColorData("Green", Color.GREEN));
		ol.add(new ColorData("Red", Color.RED));
		ol.add(new ColorData("Blue", Color.BLUE));
		ol.add(new ColorData("Yellow", Color.YELLOW));
		ol.add(new ColorData("Magenta", Color.MAGENTA));

		ListView<ColorData> lv = new ListView<>(ol);
		lv.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
		TextField txt = new TextField();
		txt.setPrefWidth(50);

		lv.setCellFactory(lv1 -> new ListCell<ColorData>() {
			
			protected void updateItem(ColorData item, boolean empty) {
				super.updateItem(item, empty);
				if (item != null && !empty) {
					setText(item.getName());
					setBackground(new Background(new BackgroundFill(item.getColor(), null, null)));
				} else {
					setText(null);
					setGraphic(null);
				}
			}
		});

		lv.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<ColorData>() {

			@Override
			public void changed(ObservableValue<? extends ColorData> arg0, ColorData arg1, ColorData arg2) {
				System.out.println(arg2.getName());
				txt.setText(arg2.getName());
				txt.setBackground(new Background(new BackgroundFill(arg2.getColor(), null, null)));
			}

		});
		VBox vb = new VBox(10, lv, txt);
		vb.setPadding(new Insets(5));

		primaryStage.setScene(new Scene(vb));
		primaryStage.setTitle("T3FX_C1");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
