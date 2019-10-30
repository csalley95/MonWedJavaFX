package bsu.comp152;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.scene.control.Label;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox box = new VBox();
        var text = new Label("Hello Comp152");
        var color = Paint.valueOf("Blue");
        text.setTextFill(color);
        var font = Font.font(22);
        text.setFont(font);
        box.getChildren().add(text);
        var container = new Scene(box);
        Button pushButton = new Button("Push me");
        pushButton.setFont(font);
        var color2 = Paint.valueOf("Green");
        pushButton.setTextFill(color2);
        box.getChildren().add(pushButton);
        primaryStage.setScene(container);
        primaryStage.setTitle("Example Window");
        primaryStage.setMinWidth(300);
        primaryStage.show();

    }
}
