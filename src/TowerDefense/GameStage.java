package TowerDefense;

import java.util.List;

public class GameStage {
    private final long width;
    private final long height;

    private final List<GameEntity> entities;

    public GameStage(long width, long height, List<GameEntity> entities) {
        this.width = width;
        this.height = height;
        this.entities = List.copyOf(entities);
    }
}
