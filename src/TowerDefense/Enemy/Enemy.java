package TowerDefense.Enemy;

import TowerDefense.GameEntity;
import TowerDefense.Tile.GameTile;
import TowerDefense.config;
import javafx.animation.Animation;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.skin.TextInputControlSkin;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;



public abstract class Enemy extends GameEntity {
    /*private double posX;
    private double posY;
    private double width;
    private double height;
    */


    enum Direction {
        LEFT(180), UP(270), RIGHT(0), DOWN(90);

        int degree;

        Direction(int i) {
            degree = i;
        }

        int getDegree() {
            return degree;
        }
    }
    Direction direction;


    int wayPointIndex = 0;
    final double enemyPosX = getPosX();
    final double enemyPosY = getPosY();
    final double enemyWidth = getWidth();
    final double enemyHeight = getHeight();
    double newPosX = enemyPosX;
    double newPosY = enemyPosY;
    private double health;
    private double speed;
    private double realspeed;
    private double reward;
    private ImageView imageView;



    public Enemy(double posX, double posY, double width, double height,Image image, double health, double speed)
    {
        super(posX,posY,width,height,image);

        this.health = health;
        this.speed = speed;
        this.reward = reward;
        this.imageView = new ImageView(image);

    }


    public double getHealth() {
        return health;
    }
    public double getSpeed() {
        return speed;
    }
    public double getReward() {
        return reward;
    }

    public boolean isDead() {
        return health == 0;
    }
    public double getNewPosX(){
        return newPosX;
    }
    public double getNewPosY(){
        return newPosY;
    }

    public void calculateDirection(double speed,double realspeed){
        // Tinh huong di tiep theo cho Object
        /*if (wayPointIndex >= 15*config.TILE_SIZE) {
            // Enemy den way point cuoi
            return;
        }
         */
        for(realspeed = speed*0.125;realspeed <=speed;realspeed+= realspeed);
        {
            newPosX += speed+ realspeed;
            newPosY -= speed+ realspeed;
        }
    }
    public ImageView getView() {
        return imageView;
    }

    public void update()
    {
        calculateDirection(speed,realspeed);
        imageView.relocate(newPosX,newPosY);
/*
        switch (direction) {
            case UP:
                enemyPosY -= speed;
                break;
            case DOWN:
                enemyPosY += speed;
                break;
            case LEFT:
                enemyPosX -= speed;
                break;
            case RIGHT:
                enemyPosX += speed;
                break;
        }

 */
    }

    @Override
    public void render(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(this.getImage(), this.getNewPosX() * config.TILE_SIZE, this.getNewPosY() * config.TILE_SIZE);
    }


}
