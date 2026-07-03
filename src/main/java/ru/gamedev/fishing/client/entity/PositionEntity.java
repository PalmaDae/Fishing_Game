package ru.gamedev.fishing.client.entity;

public class PositionEntity {
    private int x;
    private int y;
    public PositionEntity(int x,int y){
        this.x=getRandomXPosition();
        this.y=getRandomYPosition();
    }

    public int getRandomXPosition(){
        int max= ;
        int min= ;
        return (Math.random()(max-min+1)-min)

    }

    public int getRandomYPosition(){
        return (Math.random()*())
    }
}
