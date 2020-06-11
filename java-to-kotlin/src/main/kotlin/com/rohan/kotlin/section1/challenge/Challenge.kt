package com.rohan.kotlin.section1.challenge

fun main(args: Array<String>) {

    // 1. Declare two immutable String variables called hello1 and hello2.
    // Assign "Hello: to both variables
    val hello1 = "Hello"
    val hello2 = "Hello"

    // 2. Using one line of code, test whether hello1 and hello2 are referentially equal
    // True, because of the String pool
    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    // 3. Using one line of code, test whether hello1 and hello2 are structural equal
    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    // 4. Declare a mutable variable of type Int and assign it the value of 2988
    var number = 2988

    // 5. Declare an immutable variable of type Any and assign it the String "The Any type is the root
    // of the Kotlin class hierarchy". Then, using a smart cast, print uppercase string
    val any: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (any is String) {
        println(any.toUpperCase())
    }

    // 6. Using one line of code, print out the following. Make sure your code is nicely indented
    //    1
    //   1 1
    //  1 1 1
    // 1 1 1 1
    println(
        """
        |   1
    |  11
    | 111
    |1111""".trimMargin()
    )


    println(
        """   1   1
                  1  11
                  1 111
                  11111""".trimMargin("1")
    )
}