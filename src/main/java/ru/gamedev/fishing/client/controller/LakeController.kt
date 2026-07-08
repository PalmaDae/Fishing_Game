package ru.gamedev.fishing.client.controller

import ru.gamedev.fishing.client.entity.LakeEntity
import ru.gamedev.fishing.client.service.LakeService


//Возможно стоит создать общий GameController
class LakeController {
    private val lakeService = LakeService()
    //Вообще опасная тема, лучше бы как-то использовать проверку на null типы
    //Спасибо котлину и неспасибо джаве
    private lateinit var lake: LakeEntity;

    fun generateLake(width: Int, height: Int, fishCount: Int): LakeEntity {
        lake = LakeEntity(width, height, 0, 0, "Озеро")
        lakeService.fishCreate(fishCount, lake)
        return lake
    }

    fun getLake(): LakeEntity {
        return lake;
    }
}