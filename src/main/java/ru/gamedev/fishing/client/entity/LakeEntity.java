package ru.gamedev.fishing.client.entity;

import java.util.ArrayList;
import java.util.List;

public class LakeEntity {
    private int lakeXSize;
    private int lakeYSize;
    private List<FishEntity> fishList;
    private String nameLake;
    private LakeType type;

    public LakeEntity(int lakeXSize,int lakeYSize,String nameLake,int numberOfFish){
        this.lakeXSize=lakeXSize;
        this.lakeYSize=lakeXSize;
        this.nameLake=nameLake;
        this.type=LakeType.DEFAULT_LAKE;
        fishCreate(numberOfFish);
    }

    public List<FishEntity> fishCreate (int numberOfFish) {
        List<FishEntity> lakedFish = new ArrayList<>();
        for(int i=0 ; i<numberOfFish ; i++){
            lakedFish[i]=new FishEntity()
        }

        return lakedFish;
    }

}
