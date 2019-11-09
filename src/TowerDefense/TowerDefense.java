package TowerDefense;

import TowerDefense.Enemy.Enemy;
import TowerDefense.Enemy.SmallerEnemy;
import TowerDefense.Tile.Tower.NormalTower;
import TowerDefense.Tile.Tower.Tower;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;

import javax.swing.*;

public class TowerDefense extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Enemy a = new SmallerEnemy();
        Canvas canvas = new Canvas(config.SCREEN_WIDTH, config.SCREEN_HEIGHT);
        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        drawMap(graphicsContext);
        //Tower tower = new NormalTower(3, 2, config.TILE_SIZE, config.TILE_SIZE, new Image("file:src/AssetsKit_2/PNG/Default size/towerDefense_tile180.png"), 50, 30, 30, new Image("file:src/AssetsKit_2/PNG/Default size/towerDefense_tile250.png"));
        //tower.render(graphicsContext);
        a.update();
        a.render(graphicsContext);

        Group root = new Group();
        root.getChildren().add(canvas);
        Scene scene = new Scene(root);

        primaryStage.setScene(scene);
        primaryStage.show();



    }
    /*
    public Enemy createEnemy(){
        Enemy Senemy = new SmallerEnemy();
        return Senemy;
    }

     */

    public String[][] MAP_SPRITES = new String[][] {
            {"024","024","024","024","069","070","070","070","070","070","071","024","024","024","024",},
            {"024","024","024","024","092","093","093","093","093","093","094","024","024","024","024",},
            {"024","024","024","024","092","093","072","116","073","093","094","024","024","024","024",},
            {"024","024","024","024","092","093","094","024","092","093","094","024","024","024","024",},
            {"024","024","024","024","092","093","094","024","092","093","094","024","024","024","024",},
            {"069","070","070","070","096","093","094","024","092","093","094","024","024","024","024",},
            {"092","093","093","093","093","093","094","024","092","093","094","024","024","024","024",},
            {"092","093","072","116","116","116","117","024","092","093","095","070","070","070","070",},
            {"092","093","094","024","024","024","024","024","092","093","093","093","093","093","093",},
            {"092","093","094","024","024","024","024","024","115","116","116","116","116","116","116",},

    };

    private void drawMap(GraphicsContext graphicsContext)
    {
        for (int i = 0; i < MAP_SPRITES.length; i++)
        {
            for (int j = 0; j < MAP_SPRITES[i].length; j++)
            {
                graphicsContext.drawImage(new Image("file:src/AssetsKit_2/PNG/Default size/towerDefense_tile" + MAP_SPRITES[i][j] + ".png"), j * config.TILE_SIZE, i * config.TILE_SIZE);
            }
        }
    }


}
