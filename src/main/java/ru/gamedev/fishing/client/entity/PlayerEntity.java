package ru.gamedev.fishing.client.entity;

public class PlayerEntity{
    private int hp;
    private int iq;
    private String name;
    private int moveSpeed;

    public PlayerEntity(int hp,int iq,String name,int moveSpeed){
        this.hp=hp;
        this.iq=iq;
        this.name=name;
        this.moveSpeed=moveSpeed;
    }
    public void move(String direction){

    }
    public void use(){

    }
}