package ru.gamedev.fishing.client.entity;

public class FishEntity {
    private int cost;
    private String name;
    private int resistance;

    public FishEntity(int cost,String name,int resistance){
        this.cost=cost;
        this.name=name;
        this.resistance=resistance;
    }

    public String getName() {
        return name;
    }

    public void move(String n){
         System.out.println("Рыба двинулась в сторону: "+n);
     }
}
