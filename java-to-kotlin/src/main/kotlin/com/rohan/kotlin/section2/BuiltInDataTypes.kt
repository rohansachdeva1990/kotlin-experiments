package com.rohan.kotlin.section2

import com.rohan.java.section2.DummyClass

fun main(args: Array<String>) {

    // ----------------------------------- Primitive Types

    val myInt = 10
    var myLong = 22L
    val myLong1: Long = 23 // Still long

    // Widening Example
    /*
        // In Java, below is OK
        int i = 10;
        long l = i;
     */
    // Error: Type mistmatch
    //myLong = myInt
    myLong = myInt.toLong()

    val myByte: Byte = 111
    var myShort: Short
    myShort = myByte.toShort()

    var myDouble = 69.984
    println(myDouble is Double)
    println("default datatype is integer ${myInt is Int}")

    val myFloat = 983.98324f
    println("myFloat is a float: ${myFloat is Float}")

    myDouble = myFloat.toDouble();

    val char: Char = 'b'
    //val myChar: Char = '65' // Error
    val myCharInt = 65
    println(myCharInt.toChar())
    val myBoolean: Boolean = true

    // ------------------------------------- User Defined Type

    val vacationTime = false

    // Calling Java from Kotlin
    val onVaction = DummyClass().isVacationTime(vacationTime)
    println(onVaction)

    // -------------------------------------- Any, Nothing & Unit

    val anything: Any
    val nothing: Nothing
    val myUnit: Unit

}