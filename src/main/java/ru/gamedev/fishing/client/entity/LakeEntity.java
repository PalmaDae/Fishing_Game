package ru.gamedev.fishing.client.entity;


import ru.gamedev.fishing.client.entity.enums.LakeType;


public class LakeEntity {
    private FishEntity[][] lakeSize;
    private int lakeStartX;
    private int lakeStartY;
    private String nameLake;
    private LakeType type;

    public LakeEntity(int lakeXSize,int lakeYSize,int lakeStartX,int lakeStartY,String nameLake){
        this.lakeSize=new FishEntity[lakeYSize][lakeXSize];
        this.nameLake=nameLake;
        this.lakeStartX=lakeStartX;
        this.lakeStartY=lakeStartY;
        this.type=LakeType.DEFAULT_LAKE;
    }

    public FishEntity[][] getLakeMatrix(){
        return lakeSize;
    }

    public FishEntity[][] getLakeSize() {
        return lakeSize;
    }
}
