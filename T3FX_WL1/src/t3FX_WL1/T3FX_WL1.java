package t3FX_WL1;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class T3FX_WL1 extends Application {

	Label lbl1 = new Label("First cod");
	private BufferedReader br;

	@Override
	public void start(Stage primaryStage) {
		VBox vb = new VBox(10, lbl1);
		vb.setPadding(new Insets(5));
		// Event Handler zuordnen
		primaryStage.addEventHandler(WindowEvent.WINDOW_SHOWING, e -> handlerWindowSchowing());
		primaryStage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, e -> handlerCloseRequest());

		primaryStage.setScene(new Scene(vb, 700, 400));
		primaryStage.setTitle("T3FX_WL1");
		primaryStage.show();

	}

	private void handlerCloseRequest() {
		try {
			br.close();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	private void handlerWindowSchowing() {
		try {
			/* BufferedReader */ br = Files.newBufferedReader(Paths.get("C:\\Java\\T3FX_WL1.txt"));
			lbl1.setText(br.readLine());
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		launch(args);
	}
}
