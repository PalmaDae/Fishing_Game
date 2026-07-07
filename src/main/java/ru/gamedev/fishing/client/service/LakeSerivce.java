package ru.gamedev.fishing.client.service;

import ru.gamedev.fishing.client.entity.FishEntity;
import ru.gamedev.fishing.client.entity.enums.FishDefaults;
import ru.gamedev.fishing.client.entity.enums.FishRares;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LakeSerivce {
    public List<FishEntity> fishCreate (int numberOfFish) {
        List<FishEntity> fishOfTheLake=new ArrayList<>();
        Random random = new Random();
        for(int i=0;i<numberOfFish;i++){
            FishDefaults[] allFishes=FishDefaults.values();

            int random2=random.nextInt(101);

            if (random2< 100- FishRares.DEFAULT.getChance()&&random2>=FishRares.getObshiyChance(FishRares.RARE)){
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
            int x=random.nextInt(lakeSize[0].length);
            int y=random.nextInt(lakeSize.length);

            fishOfTheLake.add(new FishEntity(allFishes[random2], x, y));
            lakeSize[y][x]= new FishEntity(allFishes[random2],x,y);
        }
        return fishOfTheLake;
    }
}
