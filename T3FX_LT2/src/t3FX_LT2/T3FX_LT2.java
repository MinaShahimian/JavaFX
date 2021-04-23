package t3FX_LT2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class T3FX_LT2 extends Application {

	@Override
	public void start(Stage primaryStage) {

		TextArea ta = new TextArea();
		ta.setPrefColumnCount(50);
		ta.setPrefRowCount(6);
		Button lesen = new Button("lesen");
		Button schreiben = new Button("schreien");

		BorderPane bp = new BorderPane();
		bp.setLeft(lesen);
		bp.setRight(schreiben);
		bp.setCenter(ta);

		schreiben.setOnAction(e -> {
			try {
				PrintWriter pw = new PrintWriter("C:\\Java\\T3FX_LT2");
				pw.print(ta.getText());
				pw.close();
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			}
		});

		lesen.setOnAction(e -> {
			try {
				List<String> ls = Files.readAllLines(Paths.get("C:\\Java\\T3FX_LT2"));
				StringBuilder sb = new StringBuilder();
				for (int i = ls.size() - 1; i >= 0; i--)
					sb.append(ls.get(i) + "\n");
				ta.setText(sb.toString());
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		});

		primaryStage.setScene(new Scene(bp));
		primaryStage.setTitle("T3FX_LT2");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
