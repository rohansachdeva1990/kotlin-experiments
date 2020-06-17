package com.rohan.kotlin.section3

interface MyInterface {
    val number: Int // Is abstract

    // No property initializer allowed here
    //    val number2: Int = 1213

    // Similar to default functions
    val number2: Int
        get() = number * 10

    fun myFunction(str: String): String
}

interface MySubInterface : MyInterface {
    fun mySubFunction(num: Int): String
}

class Anything : MySubInterface {

    val anyProperty: String

    // Concrete implementation of interface property
    override val number: Int = 25

    // We can override the abstract property even if it is implemented in upper level
    //override val number2: Int = 24

    constructor(anyValue: String) {
        anyProperty = anyValue
    }

    override fun mySubFunction(num: Int): String {
        TODO("Not yet implemented")
    }

    override fun myFunction(str: String): String {
        TODO("Not yet implemented")
    }

}