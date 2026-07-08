package ru.gamedev.fishing.client.view.screen

import ru.gamedev.fishing.client.controller.LakeController
import ru.gamedev.fishing.client.entity.enums.FishDefaults
import ru.gamedev.fishing.client.entity.FishEntity
import ru.gamedev.fishing.client.view.fragment.FishFragment
import tornadofx.View
import tornadofx.vbox

class GameScreen : View("Game Screen") {
    private val lakeController = LakeController()

    override val root = vbox {
        val currentLake = lakeController.getLakeField();

        val misha = FishEntity(FishDefaults.SALMON,0,0)

        val fishParams = mapOf(FishFragment::fish to misha)
        val fishSpawn = find<FishFragment>(fishParams)

        add(fishSpawn)
    }
}