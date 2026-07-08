package ru.gamedev.fishing.client.view.screen

import ru.gamedev.fishing.client.controller.GameController
import ru.gamedev.fishing.client.controller.LakeController
import ru.gamedev.fishing.client.entity.enums.FishDefaults
import ru.gamedev.fishing.client.entity.FishEntity
import ru.gamedev.fishing.client.view.fragment.FishFragment
import tornadofx.View
import tornadofx.gridpane
import tornadofx.vbox

class GameScreen : View("Game Screen") {

    private val gameController = GameController()

    override val root = gridpane {
        val lake = gameController.startGame()
        val matrix = lake.lakeMatrix

        for (y in matrix.indices) {
            for (x in matrix[y].indices) {

                val fish = matrix[y][x]

                if (fish != null) {
                    val fishFragment = find<FishFragment>(
                        FishFragment::fish to fish
                    )

                    add(
                        fishFragment.root,
                        x,
                        y
                    )
                }
            }
        }
    }
}