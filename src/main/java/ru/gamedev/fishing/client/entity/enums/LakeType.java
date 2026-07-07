package ru.gamedev.fishing.client.entity.enums;

public enum LakeType {
    DEFAULT_LAKE("Обычное озеро"),
    DALDON_LAKE("Далдонское озеро"),
    SALTY_LAKE("Соленое озеро");

    private final String name;

    LakeType(String name){
        this.name=name;
    }

}
