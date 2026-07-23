package ru.gamedev.fishing.client.entity.enums;

import ru.gamedev.fishing.client.entity.PlayerEntity;

public abstract class WorldObject {
    private String name;
    private boolean blockMovement;
    private boolean isUsable;

    public WorldObject(String name,boolean blockMovement,boolean isUsable){
    this.name=name;
    this.blockMovement=blockMovement;
    this.isUsable=isUsable;
    }

    public abstract void use(PlayerEntity player );

    public String getName() {return name;}
    public boolean getBlockMovement(){return blockMovement;}
    public boolean getIsUsable(){return isUsable;}
}
