package com.rohan.kotlin.section3

fun main(args: Array<String>) {
    println(Department.IT.getDepartmentInfo())
}

enum class Department(val fullName: String, val numEmployees: Int) {
    HR("Human Resources", 5),
    IT("Information Technology", 10),
    ACCOUNTING("Accounting", 20),
    SALES("Sales", 20);  // On Exception to no semi colon property of Kotlin

    fun getDepartmentInfo() = "The $fullName department has $numEmployees employees"
}