package com.rohan.kotlin.section2

fun main(args: Array<String>) {

    // Compile Error: You cannot assign a null value to a non null type
    // val str: String = null

    // You can assign a null now, making it nullable
    val str: String? = null

    val str1: String? = "This isn't null"
    /*
    if (str1 != null) {
        str1.toUpperCase()
    }*/
    // Shorthand for above
    str1?.toUpperCase()

    // What happens when we try to access nullable object using safe access, when the value is null
    /*
        if(str3 == null){
            return null;
        }
        else {
            return str3.toUpperCase();
        }

        Below is the shorthand for the same
     */
    val str3: String? = null
    println("What happens when we do this : ${str3?.toUpperCase()}") // print null

    // Below we avoided nested null checks; Safety operator short circuits when a null is found
    val bankBranch: BankBranch? = null
    val countryCode: String? = bankBranch?.address?.country?.countryCode

    // Elvis operator example: To have a default value
    val str4: String = str3 ?: "This is a default value because str3 was null"
    println(str4)
    val countryCodeDefault = bankBranch?.address?.country?.countryCode ?: "10010"

    // Casting array to String
    val something: Any = arrayOf(1, 2, 3, 4)
    // Here we are safely casting something to String, If not castable, it returns null
    var str5 = something as? String
    //var str6: String? = something as? String
    println(str5) // null

    // Not null assertion; When we know its not going to be null
    val str7: String? = "This isn't null"
    //val str8 =  str7.toUpperCase() // Compile Error: Because compiler see it possible nullable
    // Here we want to avoid safe call operator.
    /*
        Below operation is shorthand for:-
        if(str == null){
            throw exception
        }
        else {
            str.toUpperCase()
        }
     */
    val str8 = str7!!.toUpperCase()

    // Runtime checks the whether the assertion true
    val s: String? = null
    val s2 = s!! // NPE (Only where we made the assertion)
    val s3 = s2.toUpperCase() // NPE not here

    // Passing nullable objects to function accepting non null value
    val someString: String? = "This ain't null"
    //printText(someString) // Compile Error
    printText(someString!!)  // Way1
    // Or way2 don't call it
    /*
        Long way
        if(someString != null){
            printText(someString)
        }
     */
    someString?.let { printText(it) }

    // "==" operator is safe for null checks
    val text: String? = null;
    val anotherText = "This isn't nullable"
    println(str4 == anotherText)

    // Arrays and null references
    // Array of null, when we don't know the possible values
    val nullableInts = arrayOfNulls<Int>(5)
    // Should print 5 x null
    for(i in nullableInts){
        print(i)
    }
    nullableInts[3].toString()
}

class BankBranch(val address: Address) {}
class Address(val country: Country) {}
class Country(val countryCode: String) {}


fun printText(text: String) {
    println(text)
}
