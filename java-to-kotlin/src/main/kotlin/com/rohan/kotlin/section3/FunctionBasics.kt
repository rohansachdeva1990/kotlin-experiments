package com.rohan.kotlin.section3


fun main(args: Array<String>) {
    println(labelMultiply(3, 4, "The result is"))
    println(labelMultiplyInOneLine(2, 4, "The result is"))
    println(labelMultiplyInOneLineDefaultLabel(3, 7))

    // Passing parameter in any order
    // Use full when you have lots of parameter of same type. So to identify,
    // what refer to what, we can explicitly use the param-value pairs for the
    // extra clarity
    println(
        labelMultiply(
            label = "Here's the result is",
            operand2 = 4,
            operand1 = 9
        )
    )

    val emp1 = EmployeeForFunctionBasics("Jack")
    println(emp1.upperCaseFirstName())

    val car1 = CarForFunctionBasics("Red", "L'Ferrari", 2020)
    val car2 = CarForFunctionBasics("Yellow", "Porsche", 2020)
    val car3 = CarForFunctionBasics("Green", "Jaguar", 2020)

    printColors(car1, car2, car3)
    printColorsExtra(car1, car2, str = "Color:") // Need to use named parameter
    printColorsExtraDifferentWay("Color: ", car1, car3)
    println("Using spread operator")
    val manyCars = arrayOf(car1, car2, car3)
    printColors(*manyCars)
    val moreCars = arrayOf(car2, car3)
    val car4 = car2.copy()

    // Showcases unpack
    val lotsOfCars = arrayOf(*manyCars, *moreCars, car4)
    for(c in lotsOfCars){
        println(c)
    }
}

fun labelMultiply(operand1: Int, operand2: Int, label: String): String {
    return ("$label: ${operand1 * operand2}")
}

// More concise : Remove return type
fun labelMultiplyInOneLine(
    operand1: Int,
    operand2: Int,
    label: String
): String =
    "$label: ${operand1 * operand2}"

fun labelMultiplyInOneLineDefaultLabel(
    operand1: Int,
    operand2: Int,
    label: String = "The result is"
): String =
    "$label: ${operand1 * operand2}"

fun whatever() = 3 * 5

fun printColors(vararg cars: CarForFunctionBasics) {
    for (car in cars) {
        println(car.color)
    }
}

fun printColorsExtra(vararg cars: CarForFunctionBasics, str: String) {
    println(str)
    for (car in cars) {
        println(car.color)
    }
}

fun printColorsExtraDifferentWay(str: String, vararg cars: CarForFunctionBasics) {
    println(str)
    for (car in cars) {
        println(car.color)
    }
}

class EmployeeForFunctionBasics(val firstName: String) {

    fun upperCaseFirstName() = firstName.toUpperCase()

}

data class CarForFunctionBasics(
    val color: String,
    val Model: String,
    val year: Int
)