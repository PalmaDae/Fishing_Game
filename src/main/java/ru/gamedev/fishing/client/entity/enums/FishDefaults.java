package ru.gamedev.fishing.client.entity.enums;


public enum FishDefaults implements BestiaryCommon{
    SALMON("Лососось",FishRares.DEFAULT,50),
    CRAB("Краб",FishRares.DEFAULT,80),
    LOBSTER("Лобстер", FishRares.DEFAULT,150),
    OCTOPUS("Осьминог",FishRares.RARE,250),
    EMOFISH("Рыба-Эмо",FishRares.RARE,300),
    ALTUHA("АЛЬТУХА",FishRares.EPIC,500),
    DENIFISH("Динар",FishRares.EPIC,600),
    ARTHURFISH("Артурчик",FishRares.LEGENDARY,700),
    RYDOLF("Рудольф",FishRares.LEGENDARY,700),
    PALMAFISH("Пальмунчик",FishRares.DALDONIO,900),
    DALDONFISH("Далонорыба",FishRares.DALDONIO,777),
    KOSTILFISH("ГОВНО",FishRares.DEFAULT,0);



    private final String name;
    private final FishRares rarity;
    private final int cost;
    private LakeType lakeType;

    FishDefaults(String name,FishRares rarity,int cost){
        this.name=name;
        this.rarity=rarity;
        this.cost=cost;
        this.lakeType=LakeType.DEFAULT_LAKE;
    }
    @Override
    public String getName(){ return name;}
    @Override
    public FishRares getRarity(){return  rarity;}
    @Override
    public int getCost(){return cost;}
    @Override
    public int getChanse(){return rarity.getChance();}

}
