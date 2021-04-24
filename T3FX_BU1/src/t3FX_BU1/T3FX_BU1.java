package t3FX_BU1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class T3FX_BU1 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Button Loeschen = new Button("Löschen");
		TextField txt = new TextField();
		txt.setPrefWidth(200);

		TextField txt2 = new TextField();
		txt2.setPrefWidth(200);

		GridPane gp = new GridPane();
		gp.add(Loeschen, 0, 0);
		gp.add(txt, 1, 0);
		gp.add(txt2, 1, 1);


	//	Loeschen.setOnAction(e->txt.setText(""));
		Loeschen.setOnAction(e->{
			txt.clear();
			txt2.clear();
			
		});
		
		
		
		primaryStage.setScene(new Scene(gp,300,200));
		primaryStage.setTitle("T3FX_BU1");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
