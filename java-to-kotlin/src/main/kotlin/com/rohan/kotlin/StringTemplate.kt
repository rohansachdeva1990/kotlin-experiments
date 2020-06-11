package com.rohan.kotlin

fun main(args: Array<String>) {
    val employee = EmployeeForStringTemplate("Rohan", 1)
    println(employee)

    val change = 4.22
    println("To show the value of change \$$change")

    val num = 10.99
    val den = 20.00
    println("The value of $num divided by $den is ${num / den}")
    println("The employee's id is ${employee.id}")
}

class EmployeeForStringTemplate(var name: String, val id: Int) {

    override fun toString(): String {
        // String template
        return "EmployeeForStringTemplate(name=$name, id=$id)"
    }
}