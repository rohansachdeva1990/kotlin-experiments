package com.rohan.kotlin.section1

fun main(args: Array<String>) {

    val something: Any = 10;
    if (something is Int) {
        val value = something as Int
        println(value)
    }

    val employee = EmployeeCasting("Rohan", 1)
    val somethingElse: Any = employee
    if (somethingElse is EmployeeCasting) {
        // This explicit casting using as is not required because once
        // in kotlin an "Any" object is identified as the target type. Kotlin
        // smartly typecast (implicit) for us
        //val newEmployee = somethingElse as EmployeeCasting
        val newEmployee = somethingElse
        println(newEmployee.name)
    }
}

class EmployeeCasting(var name: String, val id: Int) {

}