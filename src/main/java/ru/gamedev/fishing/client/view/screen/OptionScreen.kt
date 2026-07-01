package ru.gamedev.fishing.client.view.screen

import javafx.geometry.Pos
import tornadofx.Stylesheet.Companion.label
import tornadofx.View
import tornadofx.borderpane
import tornadofx.hbox
import tornadofx.label

class OptionScreen : View("Option Screen") {
    override val root = hbox {
        alignment = Pos.CENTER
        label("You in options")
    }
}