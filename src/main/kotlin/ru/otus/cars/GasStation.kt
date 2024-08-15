package ru.otus.cars

import ru.otus.cars.Vaz2107.LpgMouth
import ru.otus.cars.Vaz2108.PetrolMouth

class GasStation {
    fun fuelCar (car: Car, liters: Int) {
        when (car.mouth) {
            is LpgMouth -> {
                car.receiveFuel(liters)
                println("Залито $liters литров(а) газа.")
            }
            is PetrolMouth -> {
                car.receiveFuel(liters)
                println("Залито $liters литров(а) бензина.")
            }
        }
        println("Уровень топлива: ${car.carOutput.getFuelContents()} литров(а).")
    }
}
