package t3FX_BU4;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class T3FX_BU4 extends Application {

	@Override
	public void start(Stage primaryStage) {
		Label ergebnis = new Label();
		ergebnis.setPrefWidth(200);

		Button loeschen = new Button("Löschen");
		loeschen.setPrefWidth(200);
		Label lblop1 = new Label("Operand 1");
		Label lblop2 = new Label("Operand 2");

		TextField txtop1 = new TextField();
		txtop1.setPrefWidth(100);
		TextField txtop2 = new TextField();
		txtop2.setPrefWidth(100);

		Button sub = new Button("-");
		sub.setPrefWidth(30);
		Button add = new Button("+");
		add.setPrefWidth(30);
		Button mult = new Button("*");
		mult.setPrefWidth(30);
		Button div = new Button("/");
		div.setPrefWidth(30);

		GridPane gp = new GridPane();
		gp.add(ergebnis, 0, 0, 2, 1);
		gp.add(loeschen, 0, 1, 2, 1);
		gp.add(lblop1, 0, 2);
		gp.add(lblop2, 0, 3);
		gp.add(txtop1, 1, 2);
		gp.add(txtop2, 1, 3);
		gp.add(add, 2, 0);
		gp.add(sub, 2, 1);
		gp.add(mult, 2, 2);
		gp.add(div, 2, 3);

		gp.setVgap(10);
		gp.setHgap(10);
		gp.setPadding(new Insets(5));

		add.setOnAction(e -> ergebnis.setText(brechnen(txtop1.getText(), txtop2.getText(), '+')));
		sub.setOnAction(e -> ergebnis.setText(brechnen(txtop1.getText(), txtop2.getText(), '-')));
		mult.setOnAction(e -> ergebnis.setText(brechnen(txtop1.getText(), txtop2.getText(), '*')));
		div.setOnAction(e -> ergebnis.setText(brechnen(txtop1.getText(), txtop2.getText(), '/')));

		loeschen.setOnAction(e->{
			ergebnis.setText("");
			txtop1.clear();
			txtop2.clear();

		});
		
		
		primaryStage.setScene(new Scene(gp));
		primaryStage.setTitle("T3FX_BU4");
		primaryStage.show();

	}

	private String brechnen(String operand1, String operand2, char operator) {
		try {
			double zahl1 = Double.parseDouble(operand1);
			double zahl2 = Double.parseDouble(operand2);
			double ergebnis = 0;
			switch (operator) {
			case '+':
				ergebnis = zahl1 + zahl2;
				break;
			case '-':
				ergebnis = zahl1 - zahl2;
				break;
			case '*':
				ergebnis = zahl1 * zahl2;
				break;
			case '/':
				ergebnis = zahl1 / zahl2;
				break;
			}
			return operand1 + " " + operator + "" + operand2 + "=" + ergebnis;
		} catch (NumberFormatException e) {

			new Alert(AlertType.ERROR, "Fehlerhafte Zahl eingegeben").showAndWait();
			return "";

		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
