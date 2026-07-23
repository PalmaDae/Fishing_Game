package ru.gamedev.fishing.client.entity;

import ru.gamedev.fishing.client.entity.enums.Directions;

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
    private Directions lookDirection;

    public PlayerEntity(int hp,int iq,String name,int moveSpeed,int positionX,int positionY){
        this.hp=hp;
        this.iq=iq;
        this.name=name;
        this.moveSpeed=moveSpeed;
        this.positionX=positionX;
        this.positionY=positionY;
        this.lookDirection=Directions.DOWN;

    }
    public List<String> getInventory(){
        return inventory;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(int moveSpeed) {
        this.moveSpeed = moveSpeed;
    }

    public void setInventory(List<String> inventory) {
        this.inventory = inventory;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }

    public Directions getLookDirection() {
        return lookDirection;
    }

    public void setLookDirection(Directions lookDirection) {
        this.lookDirection = lookDirection;
    }
}