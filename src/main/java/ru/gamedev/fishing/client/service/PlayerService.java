package ru.gamedev.fishing.client.service;

import ru.gamedev.fishing.client.entity.PlayerEntity;

import java.util.List;

public class PlayerService {


    public void addItemInInventory(String item, PlayerEntity player){
        player.getInventory().add(item);
    }



}
