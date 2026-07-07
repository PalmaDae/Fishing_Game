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

    public static int getObshiyChance(FishRares a){
        switch(a){
            case RARE -> {
                return 15;
            }
            case EPIC -> {
                return 5;
            }
            case LEGENDARY -> {
                return 1;
            }
            case DALDONIO -> {
                return 0;
            }
        }
    return -1;
    }
}
