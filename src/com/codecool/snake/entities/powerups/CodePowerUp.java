package com.codecool.snake.entities.powerups;

import com.codecool.snake.Globals;
import com.codecool.snake.entities.GameEntity;
import com.codecool.snake.entities.Interactable;
import com.codecool.snake.entities.enemies.SimpleEnemy;
import com.codecool.snake.entities.snakes.SnakeHead;
import javafx.scene.layout.Pane;

import java.util.Random;

// a simple powerup that makes the snake grow TODO make other powerups
public class CodePowerUp extends GameEntity implements Interactable {

    public CodePowerUp(Pane pane) {
        super(pane);
        setImage(Globals.powerupCode);
        pane.getChildren().add(this);

        Random rnd = new Random();
        setX(rnd.nextDouble() * Globals.WINDOW_WIDTH);
        setY(rnd.nextDouble() * Globals.WINDOW_HEIGHT);
    }

    @Override
    public void apply(SnakeHead snakeHead) {
        snakeHead.addPart(2);
        destroy();
        new CodePowerUp(pane);
        new SimpleEnemy(pane);
    }

    @Override
    public String getMessage() {
        return "Got power-up :)";
    }
}
