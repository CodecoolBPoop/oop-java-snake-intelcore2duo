package com.codecool.snake;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javax.swing.text.AbstractDocument;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        Game game = new Game();

        primaryStage.setTitle("Cookie Game");
        Scene main = new Scene(game, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT);
        main.setFill(Color.GOLD);
        primaryStage.setScene(main);
        primaryStage.show();
        game.start();
    }

}
