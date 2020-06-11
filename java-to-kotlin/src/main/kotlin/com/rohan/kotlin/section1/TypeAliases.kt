package com.rohan.kotlin.section1

// Must be at the top
typealias PersonSet = Set<Person>

fun main(args: Array<String>) {
    val persons: PersonSet
}

class Person(var name: String, val id: Int) {

}