package com.rohan.kotlin.section1

fun main(args: Array<String>) {

    // Below we are escaping \
    var filePath = "c:\\somedir\\"

    // Using raw string
    filePath = """c:\somedir\somedir2"""

    val championsString = "champions"
    // To store multiple lines
    val aSong = """ 
       *I've paid my dues
       *Time after time
       *I've done my sentence
       *But committed no crime
       *And bad mistakes
       *I've made a few
       *I've had my share of sand kicked in my face
       *But I've come through
       *We are the champions, my friends
       *And we'll keep on fighting 'til the end
       *We are the champions
       *We are the champions
       *No time for losers
       *'Cause we are the $championsString of the world
    """.trimMargin("*")

    println(aSong)
}