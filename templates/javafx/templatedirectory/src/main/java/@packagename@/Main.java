package ${packagename};

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

	private Label label;

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void init() throws Exception {
		label = new Label("Hello world");
	}

	@Override
	public void stop() throws Exception {
	}

	@Override
	public void start(Stage aStage) throws Exception {
		StackPane root = new StackPane();
		root.getChildren().add(label);
		aStage.setTitle("Hello World");
		aStage.setScene(new Scene(root, 200, 200));
		aStage.show();
	}
}
