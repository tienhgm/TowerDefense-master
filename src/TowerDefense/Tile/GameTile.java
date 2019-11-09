package TowerDefense.Tile;

import TowerDefense.GameEntity;
import javafx.scene.image.Image;

import java.awt.*;

public abstract class GameTile extends GameEntity {

    public GameTile(double posX, double posY, double width, double height, Image image) {
        super(posX, posY, width, height, image);
    }
}
