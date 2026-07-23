package ru.gamedev.fishing.client.entity;

import ru.gamedev.fishing.client.entity.enums.TilesTypes;
import ru.gamedev.fishing.client.entity.enums.WorldObject;

public class TileClass {
    private TilesTypes type;
    private WorldObject objectOnTile;

    public TileClass(TilesTypes type){
        this.type=type;
    }

    public TilesTypes getType() {
        return type;
    }

    public void setType(TilesTypes type) {
        this.type = type;
    }

    public void setObjectOnTile(WorldObject objectOnTile) {
        this.objectOnTile = objectOnTile;
    }

    public WorldObject getObjectOnTile() {
        return objectOnTile;
    }
}
