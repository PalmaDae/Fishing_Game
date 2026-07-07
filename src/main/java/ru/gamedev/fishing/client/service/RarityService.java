package ru.gamedev.fishing.client.service;

import org.jetbrains.annotations.NotNull;
import ru.gamedev.fishing.client.entity.FishEntity;
import ru.gamedev.fishing.client.entity.enums.FishRares;

public class RarityService {

    public static int getCommonLowestChance(@NotNull FishRares a){
        switch(a){
            case RARE -> {
                return (100-FishRares.RARE.getChance()-FishRares.DEFAULT.getChance());
            }
            case EPIC -> {
                return (100-FishRares.RARE.getChance()-FishRares.DEFAULT.getChance()-FishRares.EPIC.getChance());
            }
            case LEGENDARY -> {
                return (100-FishRares.RARE.getChance()-FishRares.DEFAULT.getChance()-FishRares.EPIC.getChance()-FishRares.LEGENDARY.getChance());
            }
            case DALDONIO -> {
                return (100-FishRares.RARE.getChance()-FishRares.DEFAULT.getChance()-FishRares.EPIC.getChance()-FishRares.LEGENDARY.getChance()-FishRares.DALDONIO.getChance());
            }
        }
        return -1;
    }
}
