package ru.gamedev.fishing.client.view.fragment

import javafx.geometry.Pos
import javafx.scene.paint.Color
import jdk.internal.foreign.abi.SharedUtils.alignment
import ru.gamedev.fishing.client.entity.FishEntity
import ru.gamedev.fishing.client.entity.enums.FishRares
import tornadofx.Fragment
import tornadofx.circle
import tornadofx.label
import tornadofx.px
import tornadofx.style
import tornadofx.vbox

class FishFragment : Fragment() {

    val fish: FishEntity by param()

    override val root = vbox {
        alignment = Pos.CENTER
        spacing = 5.0

        prefWidth = 60.0
        prefHeight = 60.0

        circle(radius = 15.0) {
            fill = when (fish.rare) {
                FishRares.DEFAULT -> Color.GRAY
                FishRares.RARE -> Color.BLUE
                FishRares.EPIC -> Color.PURPLE
                FishRares.LEGENDARY -> Color.GOLD
                FishRares.DALDONIO -> Color.RED
            }
        }

        label(fish.name) {
            style {
                fontSize = 10.px
            }
        }

        setOnMouseClicked {
            println("You clicked on ${fish.name}")
        }
    }
}