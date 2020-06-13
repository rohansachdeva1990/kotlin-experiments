package com.rohan.kotlin.section2

import com.rohan.java.section2.DummyClass
import java.math.BigDecimal

fun main(args: Array<String>) {

    val names = arrayOf("Rohan", "Rajat", "Jack", "Jones")

    //Compiler will know the type of array it needs to create
    val longs1 = arrayOf(1L, 2L, 3L)
    val longs2 = arrayOf<Long>(1, 2, 3, 4)
    val longs3 = arrayOf(1, 2, 3, 4)

    println(longs2 is Array<Long>)
    println(longs3 is Array<Int>)

    // Indexing
    println(longs1[1])

    // Array construction, we are initializing it using lambda - 0,2,4,6....
    val evenNumbers = Array(16) { i -> i * 2 }
    for (number in evenNumbers) {
        println(number)
    }

    // Initializing array from 0 to 99999
    val lotsOfNumber = Array(100000) { i ->
        i
    }
    val allZeros = Array(100) { i -> 0 }
    val allZerosSecondWay = Array(100) { 0 }

    println()

    var someArray: Array<Int>
    someArray = arrayOf(1, 2, 3, 4)
    for (number in someArray) {
        println(number)
    }

    // 10, 20, 30, 40....
    someArray = Array(6) { i -> (i + 1) * 10 }
    for (number in someArray) {
        println(number)
    }

    // Mixing of data types in array
    val mixedArray = arrayOf("hello", 22, BigDecimal(10.5), 'a')
    for(element in mixedArray){
        println(element)
    }
    println(mixedArray is Array<*>)

    // Call java function with array
    val myIntArr = intArrayOf(1,2,2,3,4,5);
    DummyClass().printNumber(myIntArr)

    // Array having size
    //var someOtherArray = Array<Int>(5)
    //var someOtherArray = intArray(5)
    var array1: Array<Int>
}

