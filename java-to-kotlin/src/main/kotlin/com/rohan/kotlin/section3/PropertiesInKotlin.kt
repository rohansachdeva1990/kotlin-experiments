package com.rohan.kotlin.section3

fun main(args: Array<String>) {
    val emp1 = EmployeeWithPrivateProperties("Rohan")

    var emp2 = EmployeeWithCustomSetGet("Rajat")
    emp2.fullTime = false
    println(emp2.fullTime)
}

// We can't modify fullTime from outside
class EmployeeWithPrivateProperties(val firstName: String, private var fullTime: Boolean = true)

// By removing var, we mean the kotlin is not  going to generate
// getters and setters for us in case of fullTime
class EmployeeWithCustomSetGet(val firstName: String, fullTime: Boolean = true) {
    var fullTime = fullTime // Here we will get setters and getters

        // Custom Setters: Should be immediately after your internal properties
        get() {
            println("Running the custom get")
            return field // Backing Fields
        }
        set(value) {
            println("Running the custom set")
            field = value
        }
}