package ${packagename};

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main extends Application {

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws Exception {
	}

	@Override
	public void stop() throws Exception {
	}

	@Override
	public void start(Stage stage) throws Exception {
		final Group root = new Group();
		Scene scene = new Scene(root, 500, 200, Color.DODGERBLUE);

		final Text text = new Text(140, 120, "");
		text.setFont(Font.font("Calibri", 35));
		text.setFill(Color.WHITE);
		text.setEffect(new DropShadow());        

		Button bt = new Button("Show current time");     
		bt.setLayoutX(180);
		bt.setLayoutY(50);
		bt.setOnAction(new EventHandler<ActionEvent>() 
		{
			@Override
			public void handle(ActionEvent arg0)
			{
				text.setText("It is now: " + new SimpleDateFormat("hh:mm:ss").format(new Date()));
			}
		});

		root.getChildren().add(bt);
		root.getChildren().add(text);

		stage.setTitle("HelloWorld in JavaFX 2.0");
		stage.setScene(scene);
		stage.show();
	}
}
