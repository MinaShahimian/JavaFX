package t3FX_WL2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class T3FX_WL2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		
		Label lbl1=new Label("Label 1");
		Label lbl2=new Label("Label 2");
		Label lbl3=new Label("Label 3");

//		FlowPane fp=new FlowPane(lbl1,lbl2,lbl3);
//		fp.setPadding(new Insets(15));
//		fp.setPrefWidth(20);;
		
	HBox hb=new HBox(lbl1,lbl2,lbl3);
//		VBox vb=new VBox(lbl1,lbl2,lbl3);
		
		primaryStage.setScene(new Scene(hb,300,300));
		primaryStage.setTitle("T3FX_WL2");
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
