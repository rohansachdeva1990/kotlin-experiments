package com.rohan.kotlin.section1


fun main(args: Array<String>) {

    val employee1 = EmployeeEquality("James", 1)
    val employee2 = EmployeeEquality("John", 2)
    val employee3 = EmployeeEquality("John", 2)

    println(employee1 == employee2) // false
    println(employee2 == employee3) // true
    println(employee1.equals(employee2)) // false (Redundant)
    println(employee2.equals(employee3)) // true (Redundant)

    // Referential Equality
    println(employee1 === employee2) // false
    println(employee1 === employee2) // false

    val employee4 = employee2;
    println(employee4 === employee2) // true

    println(employee4 != employee2) // false
    println(employee4 !== employee2) // false
    println(employee2 != employee3)  // false (checks for structural equality)
    println(employee2 !== employee3) // true (because they are distinct instances)
}

class EmployeeEquality(var name: String, val id: Int) {

    // Naive implementation
    override fun equals(obj: Any?): Boolean {
        if (obj is EmployeeEquality) {
            return name == obj.name && id == obj.id;
        }
        return false;
    }
}