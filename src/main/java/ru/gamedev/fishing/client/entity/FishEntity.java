package ru.gamedev.fishing.client.entity;

import ru.gamedev.fishing.client.entity.enums.FishDefaults;
import ru.gamedev.fishing.client.entity.enums.FishRares;

public class FishEntity {
    private FishDefaults name;
    private int positionX;
    private int positionY;

    public FishEntity(FishDefaults name,int positionX,int positionY){
        this.name=name;
        this.positionX=positionX;
        this.positionY=positionY;
    }

    public String getName() {return name.getName();}
    public FishRares getRare() {return name.getRarity();}
    public int getChance(){return name.getChanse();}
    public int getCost(){return name.getCost();}
    public void move(String n){
         System.out.println("Рыба двинулась в сторону: "+n);
     }

    @Override
    public String toString() {
        return "FishEntity{" + "name=" + name + '}';
    }
}
