package ru.gamedev.fishing.client.view.screen

import javafx.geometry.Pos
import tornadofx.*

class MainScreen : View("Main Screen") {

    override val root = hbox {
        prefWidth = 400.0
        prefHeight = 200.0
        spacing = 15.0
        alignment = Pos.CENTER

        button("Start Game") {
            action {
                println("Game started")
                replaceWith(GameScreen::class)
            }
        }

        button("Options") {
            action {
                println("Options is opened")
                replaceWith(OptionScreen::class)
            }
        }

        button("Exit") {
            prefWidth = 120.0
            action {
                println("Game is exited")
                close()
            }
        }
    }
}