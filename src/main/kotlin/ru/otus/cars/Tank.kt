package ru.otus.cars

/**
 * Топливный бак
 */
interface Tank {
    /**
     * Горловина бака
     */
    val mouth: TankMouth

    val fuelLevel: Int

    /**
     * Следит за уровнем топлива
     */
    fun getContents(): Int

    /**
     * Заправить бензин
     */
    fun receiveFuel(liters: Int)
}