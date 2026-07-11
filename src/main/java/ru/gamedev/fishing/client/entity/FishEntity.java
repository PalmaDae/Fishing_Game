package ru.gamedev.fishing.client.entity;

import lombok.Getter;
import lombok.Setter;
import ru.gamedev.fishing.client.entity.enums.BestiaryCommon;
import ru.gamedev.fishing.client.entity.enums.FishDefaults;
import ru.gamedev.fishing.client.entity.enums.FishRares;
import ru.gamedev.fishing.client.entity.enums.LakeType;

import java.util.Locale;

@Getter @Setter
public class FishEntity {
    private BestiaryCommon pool;
    private int positionX;
    private int positionY;

    public FishEntity(BestiaryCommon pool,int positionX,int positionY){
        this.pool=pool;
        this.positionX=positionX;
        this.positionY=positionY;
    }

    public String getName() {return pool.getName();}
    public FishRares getRare() {return pool.getRarity();}
    public int getChance(){return pool.getChanse();}
    public int getCost(){return pool.getCost();}
    public int[] getPosition(){
        int[] i={positionX,positionY};
        return i;
    }

    public int getPositionX(){return positionX;}
    public int getPositionY(){return positionY;}
    public void setPositionX(int pos){
        this.positionX=pos;
    }
    public void setPositionY(int pos){
        this.positionY=pos;
    }
    @Override
    public String toString() {
        return "FishEntity{" + "name=" + pool + '}';
    }
}
