package ru.gamedev.fishing.client.controller

import ru.gamedev.fishing.client.service.LakeService

class GameController {
    private val lakeController = LakeController()

    fun startGame() {
        lakeController.getLakeField()
    }
}