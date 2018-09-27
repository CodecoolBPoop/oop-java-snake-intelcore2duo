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
        /*
        Label label = new Label("My Label");
        primaryStage.setTitle("Snake Game");
        Game game = new Game();
        Scene scene = new Scene(label, 550,550);
        scene.setFill(Color.GOLD);
        primaryStage.setScene(new Scene(game, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT, Color.GOLD));
        primaryStage.show();
        game.start(); */
        Game game = new Game();

        primaryStage.setTitle("Cookie Game");
        Scene main = new Scene(game, Globals.WINDOW_WIDTH, Globals.WINDOW_HEIGHT, Color.BLACK);
        main.setFill(Color.GOLD);
        primaryStage.setScene(main);
        primaryStage.show();
        game.start();
    }

}
