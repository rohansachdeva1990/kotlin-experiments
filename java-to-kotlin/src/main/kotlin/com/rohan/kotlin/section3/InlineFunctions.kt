package com.rohan.kotlin.section3

fun main(args: Array<String>) {
    labelMul(10, 20)
}

inline fun labelMul(operand1: Int, operand2: Int, label: String = "The result is") = "$label ${operand1 * operand2}"
