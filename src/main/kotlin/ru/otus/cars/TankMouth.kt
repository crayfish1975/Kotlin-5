package ru.otus.cars

abstract class TankMouth {

    private var isopen : Boolean = true

    /**
     * Открывает лючок бензобака
     */
    fun open() {
        isopen = true
    }

    /**
     * Закрывает лючок бензобака
     */
    fun close() {
        isopen = false
    }
}
