package t3FX_WL4;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class T3FX_WL4 extends Application {

	@Override
	public void start(Stage primaryStage) {

		Label Top = new Label("Top");
//	    Top.setBorder(new Border(new BorderStroke(Color.RED, BorderStrokeStyle.SOLID, null, new BorderWidths(2))));
		Top.setBackground(new Background(new BackgroundFill(Color.RED, null, null)));
		Top.setPrefHeight(40);

		Label Left = new Label("Left");
//	    Left.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(2))));
		Left.setBackground(new Background(new BackgroundFill(Color.BLUE, null, null)));
		Left.setPrefWidth(50);
		Label Right = new Label("Right");
//	    Right.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(1))));
		Right.setBackground(new Background(new BackgroundFill(Color.YELLOW, null, null)));
		Right.setPrefWidth(50);

		Label center = new Label("center");
//	    center.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(2))));
		center.setBackground(new Background(new BackgroundFill(Color.GREEN, null, null)));

		Label Bottom = new Label("Bottom");
//	    Bottom.setBorder(new Border(new BorderStroke(Color.BLACK, BorderStrokeStyle.SOLID, null, new BorderWidths(2))));
		Bottom.setBackground(new Background(new BackgroundFill(Color.BEIGE, null, null)));
		Bottom.setPrefHeight(40);

//	    FlowPane flowpane=new FlowPane();
//	    flowpane.setPadding(new Insets(5));
//	    flowpane.getChildren().add(Top);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(Top);
		borderPane.setLeft(Left);
		borderPane.setRight(Right);
		borderPane.setBottom(Bottom);
		borderPane.setCenter(center);

//	    BorderPane.setAlignment(Top, Pos.TOP_CENTER);
		Top.setAlignment(Pos.CENTER);
		Bottom.setAlignment(Pos.CENTER);
		center.setAlignment(Pos.CENTER);
		Left.setAlignment(Pos.CENTER);
		Right.setAlignment(Pos.CENTER);

//	    borderPane.setTop(lbT);

//	    VBox vb=new VBox(borderPane);
//	    Scene scene=new Scene(vb);

//	    primaryStage.setScene(new Scene(flowpane));
		Top.prefWidthProperty().bind(borderPane.widthProperty());
		Bottom.prefWidthProperty().bind(borderPane.widthProperty());

		Left.prefHeightProperty().bind(borderPane.heightProperty());
		Right.prefHeightProperty().bind(borderPane.heightProperty());
		center.prefWidthProperty().bind(borderPane.widthProperty());
		center.prefHeightProperty().bind(borderPane.heightProperty());

//	    center.setMaxSize();
		primaryStage.setScene(new Scene(borderPane, 350, 150));
		primaryStage.setTitle("BorderPane");
		primaryStage.setResizable(true);

		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
