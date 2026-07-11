package ru.gamedev.fishing.client.entity;

import java.util.ArrayList;
import java.util.List;

public class PlayerEntity{
    private int hp;
    private int iq;
    private String name;
    private int moveSpeed;
    private List<String> inventory=new ArrayList<>();
    private int positionX;
    private int positionY;

    public PlayerEntity(int hp,int iq,String name,int moveSpeed,int positionX,int positionY){
        this.hp=hp;
        this.iq=iq;
        this.name=name;
        this.moveSpeed=moveSpeed;
        this.positionX=positionX;
        this.positionY=positionY;

    }
    public List<String> getInventory(){
        return inventory;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }
}