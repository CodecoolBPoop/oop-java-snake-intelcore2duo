package com.codecool.snake.entities.powerups;

import com.codecool.snake.Globals;
import com.codecool.snake.Utils;
import com.codecool.snake.entities.Animatable;
import com.codecool.snake.entities.GameEntity;
import com.codecool.snake.entities.Interactable;
import com.codecool.snake.entities.snakes.SnakeHead;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;

import java.util.Random;

public class CodeUp extends GameEntity implements Animatable, Interactable {

    private Point2D heading;


    public CodeUp(Pane pane) {
        super(pane);

        setImage(Globals.codeUp);
        pane.getChildren().add(this);
        double speed = 0.5;
        Random rnd = new Random();
        setX(rnd.nextDouble() * Globals.WINDOW_WIDTH);
        setY(rnd.nextDouble() * Globals.WINDOW_HEIGHT);

        double direction = rnd.nextDouble() * 90;
        setRotate(direction);
        heading = Utils.directionToVector(direction, speed);
    }

    @Override
    public void step() {
        if (isOutOfBounds()) {
            destroy();
            new CodeUp(pane);
        }
        setX(getX() + heading.getX());
        setY(getY() + heading.getY());
    }

    @Override
    public void apply(SnakeHead snakeHead) {
        snakeHead.changeHealth(10);
        snakeHead.changeSpeed(1);
        destroy();
        new CodeUp(pane);
    }

    @Override
    public String getMessage() {
        return "You get 10 HP";
    }
}
