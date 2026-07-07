package ru.gamedev.fishing.client.entity;

import java.util.ArrayList;
import java.util.List;

public class PlayerEntity{
    private int hp;
    private int iq;
    private String name;
    private int moveSpeed;
    private List<String> inventory=new ArrayList<>();

    public PlayerEntity(int hp,int iq,String name,int moveSpeed){
        this.hp=hp;
        this.iq=iq;
        this.name=name;
        this.moveSpeed=moveSpeed;

    }
    public List<String> getInventory(){
        return inventory;
    }
}