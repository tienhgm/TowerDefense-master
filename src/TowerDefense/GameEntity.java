package TowerDefense;

import java.awt.*;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class GameEntity {
    private double posX;
    private double posY;
    private double width;
    private double height;
    private Image image;


    public GameEntity(double posX, double posY, double width, double height, Image image)
    {
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.image = image;
    }

    public double getPosX()
    {
        return posX;
    }
    public double getPosY()
    {
        return posY;
    }
    public double getWidth()
    {
        return width;
    }
    public double getHeight()
    {
        return height;
    }

    public Image getImage() {
        return image;
    }

    abstract public void render(GraphicsContext graphicsContext);
    abstract public void update();
}
