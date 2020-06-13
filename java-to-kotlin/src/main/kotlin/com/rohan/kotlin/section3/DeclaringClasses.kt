package com.rohan.kotlin.section3

fun main(args: Array<String>) {
    val emp = EmployeeLongestWay("Rohan")
    println(emp.firstName)

    val emp1 = EmployeeWithNoInitBlock("Rajat")
    println(emp1.firstName)

    val emp2 = EmployeeWithMultipleConstructor("Jack")
    println(emp2.firstName)
    println(emp2.fullTime)

    val emp3 = EmployeeWithMultipleConstructor("Jones", false)
    println(emp3.firstName)
    println(emp3.fullTime)

    val emp4 = EmployeeWithMultipleConstructor("Jill", false)
    println(emp4.firstName)
    println(emp4.fullTime)

    val emp5 = EmployeeWithNoConstructorsOnlySecondary()
    println(emp5.dummy)
}

/**
 * Below code are Equivalent for com.rohan.java.section3.JavaEmployee.java
 */

// Longest way :  using primary constructor
class EmployeeLongestWay constructor(firstName: String) {
    val firstName: String // A final property field

    // Initializer: Runs when primary constructor is called.
    // Basically runs in conjunction with primary constructor
    // Below is not a constructor
    init {
        this.firstName = firstName
    }
}

// Another way
class EmployeeWithNoInitBlock constructor(firstName: String) {
    val firstName: String = firstName
}

// No Properties Way
class EmployeeNoExplicitProperties constructor(val firstName: String) {}

// No Constructor Way (Most Concise Way)
class EmployeeNoConstructor(val firstName: String) {}

// With Access Modifier, You need to provide the primary constructor
// By default constructor is public
class EmployeeWithAccessModifier protected constructor(val firstName: String) {}

// Multiple Constructor Way; Do required proper delegation
class EmployeeWithMultipleConstructor(val firstName: String) {
    var fullTime: Boolean = true // Default value

    constructor(firstName: String, fullTime: Boolean) : this(firstName) {
        this.fullTime = fullTime
    }
}

// More concise way of multiple constructors, using default values.
class EmployeeWithOptionalFields(val firstName: String, var fullTime: Boolean = true)


// Only Secondary Constructor
class EmployeeWithNoConstructorsOnlySecondary {
    val dummy: String

    // We can use default values here also
    constructor() {
        dummy = "Hello"
    }
}