package com.rohan.kotlin.section3

val MY_CONSTANT = 100

fun main(args: Array<String>) {
    println(MY_CONSTANT)

    val car1 = Car("Red", "Ferrari", 2020)
    println(car1)
    val car2 = Car("Red", "Ferrari", 2020)
    println(car2)
    println(car2 == car1)

    var regularCar1 = CarWithRegularClass("Black", "Bentley", 2020)
    println(regularCar1)

    var regularCar2 = CarWithRegularClass("Black", "Bentley", 2020)
    println(regularCar2)
    println(regularCar1 == regularCar2) // false because equals is not overridden

    // Now car3 is structurally equal to car1
    var car3 = car1.copy()
    println(car3)

    var car4 = car1.copy(year = 2021, color = "Green")
    println(car4)
}

// Data Class Example
data class Car(val color: String, val model: String, val year: Int) {}

// A regular class
class CarWithRegularClass(val color: String, val model: String, val year: Int) {}