package ru.gamedev.fishing.client.entity.enums;

public enum TilesTypes {
    GRASS(true),
    DEFAULTWATER(false);

    public final boolean isPassable;

    TilesTypes(boolean isPassable){
        this.isPassable=isPassable;
    }
    public boolean isPassable(){return  isPassable;}
}
