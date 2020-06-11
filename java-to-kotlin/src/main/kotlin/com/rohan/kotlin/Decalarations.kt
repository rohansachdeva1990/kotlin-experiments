package com.rohan.kotlin

/**
 * Variable Declarations
 */
fun main(args: Array<String>) {

    // Autoboxed for us
    val number1stWay = 25

    // The way we declare in Kotlin
    val number2ndWay: Int;

    // When we need to include both type of information
    val number: Short = 10

    // Mutable (Underlined by the IDE)
    var numVar: Int
    numVar = 10
    numVar = 20

    // Declaring the class variable
    val employee1 = Employee("Rohan Sachdeva", 500)
    employee1.name = "Rohan" // Mutable
    // employee.id = 10 // Error: Because employee id is final

    // assigning to final variable on the particular context
    val employee2: Employee
    var number1 = 10;
    var number2 = 20;

    if (number1 > number2) {
        employee2 = Employee("Foo", 110)
    } else {
        employee2 = Employee("Bar", 220)
    }
}

/**
 * name - mutable
 * id - immutable
 */
private class Employee(var name: String, val id: Int) {

}
