package ru.gamedev.fishing.client.entity;

import ru.gamedev.fishing.client.entity.enums.FishDefaults;
import ru.gamedev.fishing.client.entity.enums.FishRares;
import ru.gamedev.fishing.client.entity.enums.LakeType;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LakeEntity {
    private int lakeXSize;
    private int lakeYSize;
    private int lakeStartX;
    private int lakeStartY;
    private List<FishEntity> fishList;
    private String nameLake;
    private LakeType type;

    public LakeEntity(int lakeXSize,int lakeYSize,int lakeStartX,int lakeStartY,String nameLake,int numberOfFish){
        this.lakeXSize=lakeXSize;
        this.lakeYSize=lakeYSize;
        this.nameLake=nameLake;
        this.lakeStartX=lakeStartX;
        this.lakeStartY=lakeStartY;
        this.type=LakeType.DEFAULT_LAKE;
        this.fishList=fishCreate(numberOfFish);
    }

    public List<FishEntity> fishCreate (int numberOfFish) {
        List<FishEntity> fishOfTheLake=new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<numberOfFish;i++){
            FishDefaults[] allFishes=FishDefaults.values();

            int random2=random.nextInt(101);

            if (random2< 100-FishRares.DEFAULT.getChance()&&random2>=FishRares.getObshiyChance(FishRares.RARE)){
                random2=random.nextInt(FishDefaults.getStartRarity(FishRares.RARE),FishDefaults.getEndRarity(FishRares.RARE)+1);
            }else if (random2< 100-FishRares.DEFAULT.getChance()-FishRares.RARE.getChance()&&random2>=FishRares.getObshiyChance(FishRares.EPIC)){
                random2=random.nextInt(FishDefaults.getStartRarity(FishRares.EPIC),FishDefaults.getEndRarity(FishRares.EPIC)+1);
            }else if (random2< 100-FishRares.DEFAULT.getChance()-FishRares.RARE.getChance()-FishRares.EPIC.getChance()&&random2>=FishRares.getObshiyChance(FishRares.LEGENDARY)){
                random2=random.nextInt(FishDefaults.getStartRarity(FishRares.LEGENDARY),FishDefaults.getEndRarity(FishRares.LEGENDARY)+1);
            }else if (random2< 100-FishRares.DEFAULT.getChance()-FishRares.RARE.getChance()-FishRares.EPIC.getChance()-FishRares.LEGENDARY.getChance()&&random2>=FishRares.getObshiyChance(FishRares.DALDONIO)) {
                random2 = random.nextInt(FishDefaults.getStartRarity(FishRares.DALDONIO), FishDefaults.getEndRarity(FishRares.DALDONIO)+1 );
            }
             else {
                random2 = random.nextInt(FishDefaults.getEndRarity(FishRares.DEFAULT) + 1);
            }
            int x=(int)(Math.random()*(lakeXSize-lakeStartX+1)+lakeStartX);
            int y=(int)(Math.random()*(lakeYSize-lakeStartY+1)+lakeStartY);

            fishOfTheLake.add(new FishEntity(allFishes[random2], x, y));
        }
        return fishOfTheLake;
    }
    public void printFishes(){
        for(int i=0;i<fishList.size();i++){
            System.out.println(fishList.get(i).getName());
        }
    }
    public FishEntity getFish(int i){
        return fishList.get(i);
    }
}
