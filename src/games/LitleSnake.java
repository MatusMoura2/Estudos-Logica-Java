package games;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
public class LitleSnake extends Application {

	    private static final int TILE_SIZE = 20;
	    private int width = 800;
	    private int height = 600;

	    private Rectangle snake;
	    private Rectangle food;

	    private int foodX;
	    private int foodY;

	    private int snakeX = 0;
	    private int snakeY = 0;

	    private int directionX = 1;
	    private int directionY = 0;

	    @Override
	    public void start(Stage primaryStage) {
	        Pane root = new Pane();
	        Scene scene = new Scene(root, width, height);

	        snake = new Rectangle(TILE_SIZE, TILE_SIZE);
	        snake.setFill(Color.GREEN);

	        food = new Rectangle(TILE_SIZE, TILE_SIZE);
	        food.setFill(Color.RED);

	        spawnFood();

	        root.getChildren().addAll(snake, food);

	        scene.setOnKeyPressed(event -> {
	            switch (event.getCode()) {
	                case UP:
	                    directionX = 0;
	                    directionY = -1;
	                    break;
	                case DOWN:
	                    directionX = 0;
	                    directionY = 1;
	                    break;
	                case LEFT:
	                    directionX = -1;
	                    directionY = 0;
	                    break;
	                case RIGHT:
	                    directionX = 1;
	                    directionY = 0;
	                    break;
	            }
	        });

	        primaryStage.setScene(scene);
	        primaryStage.setTitle("Snake Game");
	        primaryStage.show();

	        // Game loop
	        new javafx.animation.AnimationTimer() {
	            @Override
	            public void handle(long now) {
	                update();
	            }
	        }.start();
	    }

	    private void update() {
	        snakeX += directionX * TILE_SIZE;
	        snakeY += directionY * TILE_SIZE;

	        // Check for collisions
	        if (snakeX == foodX && snakeY == foodY) {
	            spawnFood();
	        }

	        // Update snake position
	        snake.relocate(snakeX, snakeY);
	    }

	    private void spawnFood() {
	        foodX = (int) (Math.random() * (width / TILE_SIZE)) * TILE_SIZE;
	        foodY = (int) (Math.random() * (height / TILE_SIZE)) * TILE_SIZE;
	        food.relocate(foodX, foodY);
	    }

	    public static void main(String[] args) {
	        launch(args);
	    }
	}
}
