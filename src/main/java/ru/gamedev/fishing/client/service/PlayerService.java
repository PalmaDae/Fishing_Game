package ru.gamedev.fishing.client.service;

import ru.gamedev.fishing.client.entity.MapEntity;
import ru.gamedev.fishing.client.entity.PlayerEntity;
import ru.gamedev.fishing.client.entity.TileClass;
import ru.gamedev.fishing.client.entity.enums.Directions;

import java.util.List;

public class PlayerService {

    public void addItemInInventory(String item, PlayerEntity player){
        player.getInventory().add(item);
    }

    public void movePlayer(Directions direction,PlayerEntity player,MapEntity map){
        player.setLookDirection(direction);
        int x=player.getPositionX();
        int y= player.getPositionY();
        TileClass[][] gameMap=map.getTiles();
        switch (direction){
            case UP ->{
                if ((y - 1 > 0) && gameMap[y - 1][x].getType().isPassable == true){
                    player.setPositionY(y-1);
                }
            }
            case DOWN ->{
                if ((y+1< map.getHeight())&& gameMap[y+1][x].getType().isPassable == true){
                    player.setPositionY(y+1);
                }
            }
            case LEFT -> {
                if(x-1>0 && gameMap[y][x-1].getType().isPassable==true){
                    player.setPositionX(x-1);
                }
            }
            case RIGHT -> {
                if(x+1<map.getWidth()&& gameMap[y][x+1].getType().isPassable==true ){
                    player.setPositionX(x+1);
                }
            }
        }
    }


}