package com.rohan.kotlin.section3

fun main(args: Array<String>) {
    val laserPrinter = LaserPrinter("Canon Pixma", 15)
    laserPrinter.printModel()
    val somethingElse = SomethingElse("whatever")
}

/**
 * Abstract class is open by default
 *
 * Without abstract
 * open class Printer(val modelName: String) {
 *
 */
abstract class Printer(val modelName: String) {
    open fun printModel() = println("The model name of the printer is $modelName")

    abstract fun bestSellingPrice(): Double
}

// Delegating
open class LaserPrinter(modelName: String, ppm: Int) : Printer(modelName) {
    final override fun printModel() = println("The model name of this laser printer is $modelName")

    override fun bestSellingPrice(): Double = 199.99
}

class SpecialLaserPrinter(modelName: String, ppm: Int) : LaserPrinter(modelName, ppm) {
    // We cannot override the printModel as it is final
}

// Demonstrates inheritance using secondary constructor
open class Something {
    val someProperty: String

    constructor(someParameter: String) {
        someProperty = someParameter
        println("I'm in the parent's constructor")
    }
}

class SomethingElse : Something {
    constructor(someOtherParameter: String) : super(someOtherParameter) {
        println("I'm in the child's constructor")
    }
}

// Avoid using inheritance data class
open class BaseDataClass(val id: Int) {

}

