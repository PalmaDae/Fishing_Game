package ru.gamedev.fishing.client.entity.enums;

public enum FishRares {
    DEFAULT("Обычная",60),
    RARE("Редкая",25),
    EPIC("Эпическая",10),
    LEGENDARY("Легендарная",4),
    DALDONIO("Далдонская",1);

    private final String rarityName;
    private final int chance;

    FishRares(String rarityName,int chance){
        this.rarityName=rarityName;
        this.chance=chance;
    }

    public int getChance(){return chance;}
    public String getName(){return rarityName;}

}
