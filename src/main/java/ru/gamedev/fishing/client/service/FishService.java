package ru.gamedev.fishing.client.service;

import ru.gamedev.fishing.client.entity.enums.FishDefaults;
import ru.gamedev.fishing.client.entity.enums.FishRares;

public class FishService {
    public static int getStartRarity(FishRares a) {

        for (FishDefaults daldon : FishDefaults.values()) {
            if (daldon.rarity == a) {
                return daldon.ordinal();
            }
        }
        return -1;
    }
    public static int getEndRarity(FishRares a) {
        boolean areRarityRight=false;
        FishDefaults fishdef=null;
        for(FishDefaults daldon: FishDefaults.values()){
            if(daldon.rarity==a && areRarityRight==false){
                areRarityRight=true;
                System.out.println();
            }else if (daldon.rarity==a && areRarityRight==true){
                fishdef=daldon;
            }else if (daldon.rarity!=a && areRarityRight==true){
                return fishdef.ordinal();
            }
        }
        return -1;
    }
}
