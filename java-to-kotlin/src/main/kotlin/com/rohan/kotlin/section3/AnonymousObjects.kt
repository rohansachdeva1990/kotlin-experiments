package com.rohan.kotlin.section3

fun main(args: Array<String>) {

    // Creating anonymous object
    // This object keyword does not create a singleton, it use and discard it
    wantSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String = "This is from mustImplement : ${num * 100}"
    })

    var thisIsMutable: Int = 75
    wantSomeInterface(object : SomeInterface {
        override fun mustImplement(num: Int): String {
            // Its not allowed in Java
            thisIsMutable++;
            return "This is from mustImplement : ${num * 100}"
        }
    })
    println(thisIsMutable)
}

interface SomeInterface {
    fun mustImplement(num: Int): String
}

fun wantSomeInterface(si: SomeInterface) {
    println("Printing from wantSomeInterface: ${si.mustImplement(22)}")
}