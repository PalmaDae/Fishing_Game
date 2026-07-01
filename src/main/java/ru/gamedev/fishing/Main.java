package ru.gamedev.fishing;

import ru.gamedev.fishing.client.entity.FishEntity;
import ru.gamedev.fishing.client.entity.PlayerEntity;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PlayerEntity mainHero=new PlayerEntity(100,45,"Миша",50);
        FishEntity daldonFish=new FishEntity(50,"Далдон",20);
        daldonFish.move("up");
        }
}