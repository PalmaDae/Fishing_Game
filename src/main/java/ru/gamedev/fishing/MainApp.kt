package ru.gamedev.fishing

import ru.gamedev.fishing.client.view.screen.MainScreen
import tornadofx.App
import tornadofx.launch

class MyApp : App(MainScreen::class)

fun main() {
    launch<MyApp>()
}