package t3FX_HV2;

import java.net.URI;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.BorderStroke;
import javafx.scene.layout.BorderStrokeStyle;
import javafx.scene.layout.BorderWidths;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class T3FX_HV2 extends Application {

	@Override
	public void start(Stage primaryStage) {
		BorderPane bp = new BorderPane();

		Label lbl1 = new Label("Lebel1");
		lbl1.setBorder(
				new Border(new BorderStroke(Color.BLUEVIOLET, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));
		lbl1.setPrefWidth(100);

		Label lbl2 = new Label("Lebel2");
		lbl2.setBorder(
				new Border(new BorderStroke(Color.BLUEVIOLET, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));
		lbl2.setPrefWidth(100);
		HBox hbUp = new HBox(10, lbl1, lbl2);

		Label lbl4 = new Label("Lebel4");
		Label lbl5 = new Label("Lebel5");
		Label lbl6 = new Label("Lebel6");
		Label lbl7 = new Label("Lebel7");

		GridPane gp = new GridPane();
		gp.add(lbl4, 0, 0);
		gp.add(lbl5, 1, 0);
		gp.add(lbl6, 0, 1);
		gp.add(lbl7, 1, 1);
		gp.setPadding(new Insets(10));

		Label lbl3 = new Label("Bild");
		lbl3.setBorder(
				new Border(new BorderStroke(Color.BLUEVIOLET, BorderStrokeStyle.SOLID, null, new BorderWidths(5))));
		lbl3.setPrefWidth(100);
		bp.setBottom(lbl3);

		Label lblBild = new Label();
		lblBild.setPrefWidth(300);
		URI uri = Paths.get("C:\\Java\\Mercedes.jfif").toUri();
		ImageView iv = new ImageView(uri.toString());
		iv.setPreserveRatio(true);
		iv.setFitWidth(300);
		lblBild.setGraphic(iv);

		HBox hbDn = new HBox(10, lbl3, lblBild);

		VBox vb = new VBox(hbUp, gp,hbDn);
		vb.setPadding(new Insets(10));

		primaryStage.setScene(new Scene(vb, 500, 400));
		primaryStage.setTitle("T3FX_HV2");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch(args);
	}
}
