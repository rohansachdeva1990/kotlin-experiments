package com.rohan.kotlin.section3

/**
 * Check {@link com.rohan.java.SomeClass} and {@link com.rohan.java.SomeOtherClass}
 */
fun main(args: Array<String>) {
    println(SomeClassUsingCompanion.Companion.accessPrivateVar())
    println(SomeClassUsingNamedCompanion.SomeCompanion.accessPrivateVar())
    // Can be also called without companion objects in invocation
    println(SomeClassUsingNamedCompanion.accessPrivateVar())
    println(SomeClassUsingCompanion.accessPrivateVar())

    val someClass1 = SomeClassFactoryPatternUsingCompanion.justAssign("The string as is")
    val someClass2 = SomeClassFactoryPatternUsingCompanion.upperOrLowerCase("This isn't the string as is", false)

    println(someClass1.someString)
    println(someClass2.someString)
}

class SomeClass {
    private val privateVar = 6

    // We can't access this function as is without instantiation.
    // We can't make it static as it is not allowed in Kotlin
    fun accessPrivateVar() {
        println("I am accessing private var : $privateVar")
    }
}

/**
 * Companion Object Examples
 */
class SomeClassUsingCompanion {

    /*
     * You can think like every object within companion object is static.
     */
    companion object {
        private var privateVar = 6

        fun accessPrivateVar() = "I am accessing private var : $privateVar"
    }
}

class SomeClassUsingNamedCompanion {

    /*
     * You can think like every object within companion object is static.
     */
    companion object SomeCompanion {
        private var privateVar = 6

        fun accessPrivateVar() = "I am accessing private var : $privateVar"
    }
}

class SomeClassFactoryPattern {

    val someString: String

    constructor(str: String) {
        someString = str;
    }

    constructor(str: String, lowerCase: Boolean) {
        if (lowerCase) {
            someString = str.toLowerCase()
        } else {
            someString = str.toUpperCase()
        }
    }
}

class SomeClassFactoryPatternUsingCompanion private constructor(val someString: String) {
    companion object {
        fun justAssign(str: String) = SomeClassFactoryPatternUsingCompanion(str)
        fun upperOrLowerCase(str: String, lowerCase: Boolean): SomeClassFactoryPatternUsingCompanion {
            if (lowerCase) {
                return SomeClassFactoryPatternUsingCompanion(str.toLowerCase())
            } else {
                return SomeClassFactoryPatternUsingCompanion(str.toUpperCase())
            }
        }
    }
}





