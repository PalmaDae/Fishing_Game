package ru.gamedev.fishing.client.controller

import ru.gamedev.fishing.client.entity.LakeEntity

class GameController {
    private val lakeController = LakeController()

    fun startGame(): LakeEntity {
        return lakeController.generateLake(10, 10, 25)
    }
}