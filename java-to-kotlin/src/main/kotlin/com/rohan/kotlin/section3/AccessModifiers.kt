package com.rohan.kotlin.section3

/**
 * Showcase:-
 *
 *  1. Private classes
 */

// By default : public
fun main(args: Array<String>) {

    val emp = EmployeePrivate()
    println(emp)
}

/**
 * Can be used in same file
 */
private class EmployeePrivate {

}