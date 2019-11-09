package TowerDefense.Enemy;

import TowerDefense.config;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class SmallerEnemy extends Enemy{

    public SmallerEnemy(double posX, double posY, double width, double height, Image image, double health, double speed ){
        super(posX,posY,width,height,image,health,speed);
    }
    public SmallerEnemy(){
        this(1,9,config.TILE_SIZE,config.TILE_SIZE,new Image("file:src/AssetsKit_2/PNG/Default size/towerDefense_tile248.png"),200,1);
    }


}
