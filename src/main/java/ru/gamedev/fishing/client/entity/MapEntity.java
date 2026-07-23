package ru.gamedev.fishing.client.entity;

import ru.gamedev.fishing.client.entity.enums.TilesTypes;

import java.util.List;

public class MapEntity {
    private int width;
    private int height;
    private TileClass[][] tiles;
    private PlayerEntity player;
    private List<FishEntity> fishList;


    public MapEntity(int width,int height){
        this.height=height;
        this.width=width;
        this.tiles=new TileClass[height][width];
        this.player=new PlayerEntity(100,100,"daldon",50,width/50,height/50);

        initDefaultMap();
        tiles[10][10]=new TileClass(TilesTypes.DEFAULTWATER);
    }

    private void initDefaultMap(){
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                tiles[y][x] = new TileClass(TilesTypes.GRASS);
            }
        }
    }


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public TileClass[][] getTiles() {
        return tiles;
    }

    public void setTiles(TileClass[][] tiles) {
        this.tiles = tiles;
    }

    public PlayerEntity getPlayer() {
        return player;
    }

    public void setPlayer(PlayerEntity player) {
        this.player = player;
    }

}
