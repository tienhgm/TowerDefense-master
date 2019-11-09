package TowerDefense.Tile.Tower;

import TowerDefense.Tile.GameTile;
import TowerDefense.config;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public abstract class Tower extends GameTile {
    private double damage;
    private double range;
    private double speed;
    private Image gunImg;

    public Tower(double posX, double posY, double width, double height, Image image, double damage, double range, double speed, Image gunImg) {
        super(posX, posY, width, height, image);
        this.damage = damage;
        this.range = range;
        this.speed = speed;
        this.gunImg = gunImg;
    }

    public double getDamage() {
        return damage;
    }

    public double getRange() {
        return range;
    }

    public double getSpeed() {
        return speed;
    }

    public Image getGunImg() {
        return gunImg;
    }

    @Override
    public void render(GraphicsContext graphicsContext) {
        graphicsContext.drawImage(this.getImage(), this.getPosY() * config.TILE_SIZE, this.getPosX() * config.TILE_SIZE);
        graphicsContext.drawImage(this.getGunImg(), this.getPosY() * config.TILE_SIZE, this.getPosX() * config.TILE_SIZE);
    }

    @Override
    public void update() {

    }
}
