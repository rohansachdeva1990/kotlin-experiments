package com.rohan.kotlin.section3

fun main(args: Array<String>) {
    println(Utils().upperFirstAndLast("this is all in lowercase"))
    println("now we are using extension function".upperFirstAndLast())
}

// Using extension function
fun String.upperFirstAndLast(): String {
    // You can reference public members of String here. So we can either use this or just go without it
    val upperFirst = this.substring(0, 1).toUpperCase() + this.substring(1)
    return upperFirst.substring(0, upperFirst.length - 1) +
            upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase();

}

/**
 * Just like in Java we are demonstrating a static util class
 * Simulating the java way
 */
class Utils {
    fun upperFirstAndLast(str: String): String {
        val upperFirst = str.substring(0, 1).toUpperCase() + str.substring(1)
        return upperFirst.substring(0, upperFirst.length - 1) +
                upperFirst.substring(upperFirst.length - 1, upperFirst.length).toUpperCase();

    }

}