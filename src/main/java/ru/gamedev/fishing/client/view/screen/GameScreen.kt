package ru.gamedev.fishing.client.view.screen

import javafx.geometry.Pos
import javafx.scene.paint.Color
import ru.gamedev.fishing.client.model.FishEntity
import ru.gamedev.fishing.client.view.fragment.FishFragment
import tornadofx.View
import tornadofx.circle
import tornadofx.label
import tornadofx.px
import tornadofx.style
import tornadofx.vbox

class GameScreen : View("Game Screen") {
    override val root = vbox {
        val misha = FishEntity(name = "Misha")

        val fishParams = mapOf(FishFragment::fish to misha)
        val fishSpawn = find<FishFragment>(fishParams)

        add(fishSpawn)
    }
}