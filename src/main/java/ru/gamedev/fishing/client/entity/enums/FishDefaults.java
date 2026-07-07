package ru.gamedev.fishing.client.entity.enums;


public enum FishDefaults {
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


    FishDefaults(String name,FishRares rarity,int cost){
        this.name=name;
        this.rarity=rarity;
        this.cost=cost;
    }

    public String getName(){ return name;}
    public FishRares getRarity(){return  rarity;}
    public int getCost(){return cost;}
    public int getChanse(){return rarity.getChance();}

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
