


fun main(args:Array<String>) {

    val name = "Rohan"
    //name = "dsjdhkshd"

    val greeting: String = "Rohan"
    val year: Int = 3434;

    var language: Int
    language = 13
    println(language)


    val myByte: Short = 129

    val myBoolean: Boolean = false


    println("Hello, World")



    var numbers = arrayOf(1,2,3,4,5,6,7,8,9)
    println(numbers)


 /*   var a = 10
    var b = 12

    println(a)
*/


    var a = 32
    var b = 55

    var max = if(a > b) {
        println("$a is greater than $b")
        a
    } else {
        println("$a is less than or equal to $b")
        b
    }
    println("max($a, $b) = $max")


    var dayOfWeek = 6
    when(dayOfWeek) {
        1, 2, 3, 4, 5 -> println("Weekday")
        6, 7 -> println("Weekend")
        else -> println("Invalid Day")
    }

    var primeNumbers = intArrayOf(2, 3, 5, 7, 11)
    for(n in primeNumbers){
        println(n)
    }


    var something: String? = null
    something?.let({ s -> println(s.toUpperCase()) })

}