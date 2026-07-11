package ru.gamedev.fishing.client.service;

import ru.gamedev.fishing.client.entity.FishEntity;
import ru.gamedev.fishing.client.entity.LakeEntity;
import ru.gamedev.fishing.client.entity.enums.BestiaryCommon;
import ru.gamedev.fishing.client.entity.enums.Directions;
import ru.gamedev.fishing.client.entity.enums.FishDefaults;
import ru.gamedev.fishing.client.entity.enums.FishRares;


public class FishService {


    public static int getStartRarity(BestiaryCommon[] bestiary, FishRares rarity) {

        for (BestiaryCommon fish:bestiary) {
            if (fish.getRarity() == rarity) {
                return fish.ordinal();
            }
        }
        return -1;
    }

    public static int getEndRarity(BestiaryCommon[] bestiary,FishRares rarity) {
        boolean areRarityRight=false;

        BestiaryCommon fishend=null;

        for (BestiaryCommon fish: bestiary){
            if (fish.getRarity()==rarity && areRarityRight==false){
                areRarityRight=true;
            } else if (fish.getRarity()==rarity && areRarityRight==true){
                fishend=fish;
            } else if (fish.getRarity()!=rarity && areRarityRight==true){
                return fishend.ordinal();
            }
        }
        return -1;
    }


}
