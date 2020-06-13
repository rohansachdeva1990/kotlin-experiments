package com.rohan.kotlin.section2.challenge

import com.rohan.java.section2.Challenge2

/**
 * Key Take Aways
 */
fun main(args: Array<String>) {

    //-----------------------------------------------------------------------------
    // 1. Declare a non-nullable float variable two ways, and
    // assign it the value -3874.384
    //-----------------------------------------------------------------------------

    val floatVariableWayOne = -3874.384f
    val floatVariableWayTwo: Float = -3874.384f
    val floatVariableWayThree = (-3874.384).toFloat()

    //-----------------------------------------------------------------------------
    // 2. Now change both of those variable declarations into nullable variables
    //-----------------------------------------------------------------------------

    var mutableFloat1: Float? = floatVariableWayOne;
    var mutableFloat2: Float? = floatVariableWayThree;

    //-----------------------------------------------------------------------------
    // 3. Now declare an array of type non-nullable Short, Make it of size 5,
    // and assign it the values 1, 2, 3, 4 and 5
    //-----------------------------------------------------------------------------

    val shortArray: Array<Short> = Array(5) { i -> (i + 1).toShort() }
    for (number in shortArray) {
        println(number)
    }
    val shortArrayWayTwo = shortArrayOf(1, 2, 3, 4, 5)
    val shortArrayWayThree: Array<Short> = arrayOf(1, 2, 3, 4, 5)

    //-----------------------------------------------------------------------------
    // 4. Now declare an array of nullables Ints and initialize it with the values
    // 5, 10, 15, 20, 25, 30, 35, 40, 45, 50 etc., all the way up to 200
    //-----------------------------------------------------------------------------

    val intArray = Array<Int?>(40) { i -> (i + 1) * 5 }
    for (n in intArray) {
        print("$n ")
    }
    println()

    //-----------------------------------------------------------------------------
    // 5. You have to call a Java method with following signature from Kotlin:
    // public void method1(char[] charArray). Declare an array that you could pass
    // to the method and initialize it with values 'a', 'b' and 'c'
    //-----------------------------------------------------------------------------

    // Array<Char> will not work for
    val chars = charArrayOf('a', 'b', 'c')
    Challenge2().method1(chars)

    //-----------------------------------------------------------------------------
    // 6 Given the following code:
    // Using one line of code, declare another string variable, and assign it
    // x.toLowerCase() when x isn't null, and the string "I give up!" when x is null
    //-----------------------------------------------------------------------------

    val x: String? = "I AM IN UPPERCASE"
    // val x: String? = null
    val y = x?.toLowerCase() ?: "I give up!"
    println(y)

    //-----------------------------------------------------------------------------
    // 7. Now use the "let" function to (a) lowercase the string, and then
    // (b) replace "am" with "am not: in the result. Similar to Optional
    //-----------------------------------------------------------------------------
    x?.let { it.toLowerCase().replace("am", "am not") }

    //-----------------------------------------------------------------------------
    // 8. You are really, really confident that the variable myNonNullVariable can't
    // contain null. Change the following code to assert that the myNonNullVariable
    // isn't null
    // val myNonNullVariable: Int? = null
    // myNonNullVariable?.toDouble()
    //-----------------------------------------------------------------------------
    val myNonNullVariable: Int? = null
    myNonNullVariable!!.toDouble() // NPE
}