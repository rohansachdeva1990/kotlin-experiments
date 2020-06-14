Java to Kotlin
==============

## <a name='toc'>Table of Contents</a>

  1. [Introduction to Kotlin](#section_0)
  2. [Basic differences between Kotlin and Java](#section_1)
  3. [Data Types and Null Reference Handling](#section_2)
  4. [OO and Kotlin: Classes, Functions, Inheritance](#section_3)
  5. [Loops, and the If, When and Try/Catch Expressions](#section_4)
  6. [Lambda Expressions, Collections, and Generics](#section_5)
  7. [File I/O](#section_6)
  8. [Java Interoperability](#section_7)
  9. [Summary] (#summary)

### [[↑]](#toc) <a name='section_0'>Introduction To Kotlin</a>

#### What is Kotlin
- Runs anywhere the JVM can run
- Statically typed
    - type of every expression is determined at compile time
    - compiler will know the type of expression and data before running
- Its object oriented
- Functional Programming

#### Guiding Principle
- Conciseness
    - Less boilerplate code
- Safety 
    - Difficult to generate NPE
- Pragmatic
    - Not research language
    - A solution can be solved in many ways using kotlin
    - you can be as concise or more verbose
- Interoperability
    - Designed to be interoperable with java

#### How it works
- Runs on JVM
- Kotlin code is converted to .class to run on JVM

#### Development Environment
- Intellij
- Java 8    
    
### [[↑]](#toc) <a name='section_1'>Basic differences between Kotlin and Java</a>
- The Kotlin Standard Library
    - https://kotlinlang.org/api/latest/jvm/stdlib/
    - Packages imported by default:-
        - kotlin.*
        - kotlin.annotation.*
        - kotlin.collections.*
        - kotlin.comparisons.*
        - kotlin.io.*
        - kotlin.ranges.*
        - kotlin.sequences.*
        - kotlin.text.*
        - kotlin.jvm.* (JVM Only)
        - java.lang.* (JVM Only)
    - As with java application, with kotlin we need to provide the runtime environment
    
- Variable Declaration
    - Type Inference
        - Done at compile time
    - val (final equivalent) 
        - Immutable
        - Can be assigned once 
    - var
        - Mutable
    - Good practice to use val to promise immutablity
    - Type is fixed at declaration time
    - [Source](src/main/kotlin/com/rohan/kotlin/section1/Decalarations.kt)
    
- Type Aliases
    - Aliases of existing data type
    - Always declared at the top
    - Eg. StringBuilder in Kotlin refers to java.lang.StringBuilder
    - [Source](src/main/kotlin/com/rohan/kotlin/section1/TypeAliases.kt)
    
- Quick Difference
    - No Semicolon (Optional)
    - Use of wrapper
        - println; under the hood uses System.out.println
    - Soft keywords (Don't do it to avoid confusion)
    - Hard keywords
    - Square bracket to access collections
        - println(someCollection[1])
    - Kotlin has its own String class
    - Exception
        - We have to declare checked exceptions in Java, But this is not the case with Kotlin
        - There is no "throws" keyword 
        - Both checked and unchecked comes under the same hood
        - All exceptions are unchecked, means everything is run time
    - Ternary Operator
        - No ternary operator 
            - q = x ? y : z
    - No traditional for-loop available
    - No static keyword
        - But, the concept of static is still there       
        - Syntactically its not there
    - No "new" keyword
    - "Any" is very similar to Object class in Java, but not same
    
- Equality
    - In Java, "==" checks references. But in Kotlin "==" checks both structural equality and references
    - To check referential equality we use "==="
    - "!="
    = "!=="
    - [Source](src/main/kotlin/com/rohan/kotlin/section1/Equality.kt)
    
- Bit Operators and Smart Casting
    - Rather than using "| & ^" we use "or, and, xor"
    - There is no "instanceof"
        - Its equivalent is "is"
        - not is =. !is
    - Casting using "as"
    - Smart casting is maintained if you don't change the type in current context.
    - [Bit Source](src/main/kotlin/com/rohan/kotlin/section1/BitOperator.kt)
    - [Casting Source](src/main/kotlin/com/rohan/kotlin/section1/Casting.kt)

- String Template
    - overriding the toString
    - escape "$" by "\$"
    - Use substitution instead of concatenation
    - Substitute expression using ${expression}
    - inspired from javascript ES
    - [Source](src/main/kotlin/com/rohan/kotlin/section1/StringTemplate.kt)
    
- Raw Strings
    - triple quoted string
    - no need to include escape
    - trimMargin
    - [Source](src/main/kotlin/com/rohan/kotlin/section1/RawStrings.kt)
    
- The Kotlin REPL
    - Read Eval Print Loop
    - Tools -> Kotlin -> Kotlin REPL
    - A console for Kotlin => JShell
    
### [[↑]](#toc) <a name='section_2'>Data Types and Null Reference Handling</a>

- The Builtin Data types in Kotlin
    - Everything is a class also in kotlin
    - Kotlin does not automatically widen numbers.
        - In Java, long = int is OK
        - In Kotlin, long = int is Not OK
            - But, int.toLong(), makes it do the job
        - Apply widening example accordingly
    - Kotlin class is compile to primitive types when calling a java code
    - "Any" is like object class of Java in Kotlin
        - Every Kotlin class has [Any] as a superclass
    - 'Unit' 
        - When a function does not return anything. Like void in Java
        - Used in singleton implementation
    - Nothing
        - Is a subclass of all classes
    - [Source](src/main/kotlin/com/rohan/kotlin/section2/BuiltInDataTypes.kt)

- Arrays in Kotlin
    - Arrays are object as in Java
    - arrayOf()
    - Special handling required when calling a java function having primitive array arguments
        - Use primitive array classes in Kotlin
    - What is toTypedArray?
    - [Source](src/main/kotlin/com/rohan/kotlin/section2/ArraysInKotlin.kt)

- Null References in Kotlin
    - Kotlin tries it best to avoid NPE using language constraints and the syntactic sugars
    - Null cannot be a value of a non-null type String
    - To assign a null variable you have to declare a variable of type "?"
    - Kotlin enforces null check for nullable types
    - Access the nullable object
        = str?.toUpperCase()
    - Nested null checks can be written in single line
    - To assign a default value for a nullable object result. We use elvis operator "?:"
    - Safe cast operator - "as?". Eg something as? String. Assigning value should be nullable
    - Not null assertion : If you are sure that, a variable cannot be null 
        - Use "!!"
        - Do not use "not null assertion" when chaining method calls
    - Passing nullable objects to function accepting non null value
        - Use "let"
            - someString?.let { printText(it) }
            - It is just like optional ifPresent then do something
    - "==" is a safe operator for null check as it is checking structural equality
    - Arrays and Null References
        - Array of nulls
    - [Source](src/main/kotlin/com/rohan/kotlin/section2/NullReferences.kt)

### [[↑]](#toc) <a name='section_3'>OO and Kotlin: Classes, Functions, Inheritance</a>

- Kotlin's Access Modifiers
    - We can have a class, a function and properties defined at top level in kotlin file
    - If you don't specify access modifier its public by default
        - In Java, its package-private
    - In single kotlin you can have multiple public classes in same file
    - There can be a private class as opposed to java where you can only have nested private classes
    - 4 access modifiers:-
        | Access Modifier | Kotlin                         | Java               |
        |-----------------|--------------------------------|--------------------|
        | private         | Visible within the same file   | Can't be used      |
        | protected       | Can't be used                  | Can't be used      |
        | public          | Visible everywhere             | Visible everywhere |
        | internal        | Visible within the same module | NA                 |
    - Conceptually, private, public and protected are same as Java.
    - In Kotlin, classes can't see private members belonging to inner classes
    - "internal" gets compiled to public under the cover. So any java code can access it.
        -  happens when we mix java and kotlin  
    - [Source](src/main/kotlin/com/rohan/kotlin/section3/AccessModifiers.kt)

- Declaring Classes and Using Constructors in Kotlin
    - In Kotlin, all classes are public and final by default
    - Primary constructors
    - Init block
    - Secondary constructors
        - Do not declare properties, only primary does
    - Use default parameter values to cut down the number of constructors
    - [Source](src/main/kotlin/com/rohan/kotlin/section3/DeclaringClasses.kt)

- Properties and Backing Fields in Kotlin
    - Class members are properties in Kotlin
    - We can apply access modifiers to properties
    - We use "." to use setters and getters in kotlin (Because it is provided by the kotlin to us to avoid direct access to the properties)
    - For public properties in kotlin you get the setters and getters
    - No setters are generated for val properties, because it is final. Similar in Java 
    - Rule in Kotlin: Getters and setters should have same visibility as property
        - So for private properties we need to provide setters and getters
    - If auto-generated accessor don't serve our need, then we have to explicitly specify our properties in the class.
        - These properties should not be a part of primary constructor
    - [Source](src/main/kotlin/com/rohan/kotlin/section3/PropertiesInKotlin.kt)
    
- Constants and Data Classes
   - Define constant at top of the file
   - What is data class?
        - Comes with toString, equals and hashCode, copy function 
        - You can override them accordingly
        - All properties in the primary constructor should be val or var.
        - They cannot be abstract, sealed or inner class
        - For regular classes you get default toString which is just a print of instance
   - No equals, copy, hashCode and copy function are present for regular classes
   - [Source](src/main/kotlin/com/rohan/kotlin/section3/ConstantsAndDataClass.kt)
        
- Kotlin Function Basics
   -
   - [Source](src/main/kotlin/com/rohan/kotlin/section3/FunctionBasics.kt)

- Extension Functions

- Inline Functions

- Inheritance in Kotlin

- Interfaces in Kotlin

- Singletons in Kotlin

- Companion Objects in Kotlin

- Enums in Kotlin

- Imports in Kotlin

- The Internal Access Modifier

### [[↑]](#toc) <a name='section_4'>Loops, and the If, When and Try/Catch Expressions</a>

- The For Loop

- The If Expression

- The When Expression

- The Try/Catch Expression

### [[↑]](#toc) <a name='section_5'>Lambda Expressions, Collections, and Generics</a>

- Lambda Expression Basics

- Lambdas With Receivers

- Lists

- Kotlin Collections Functions

- Maps and Destructuring Declarations

- Sets in Kotlin

- More Collections Functions in Kotlin

- Sequences in Kotlin

- Generics in Kotlin

    - Functions and Erasure
    
    - Reified Parameters in Kotlin
    
    - Covariance
    
    - Contra-variance
    
    - Use-Site Variance

### [[↑]](#toc) <a name='section_6'>File IO</a>

- Reading Text Files

- Reading Binary Files

- Try with Resources

- Walking the File Tree

### [[↑]](#toc) <a name='section_7'>Java Interoperability</a>

- Nullability when using Java from Kotlin

- Calling Java from Kotlin

- Calling Kotlin Functions from Java

- Annotations when calling Kotlin from Java

### [[↑]](#toc) <a name='summary'>Summary</a>

#### Section 1

```kotlin
    //-----------------------------------------------------------------------------
    // 1. Declare two immutable String variables called hello1 and hello2.
    // Assign "Hello: to both variables
    //-----------------------------------------------------------------------------
    val hello1 = "Hello"
    val hello2 = "Hello"

    //-----------------------------------------------------------------------------
    // 2. Using one line of code, test whether hello1 and hello2 are referentially equal
    // True, because of the String pool
    //-----------------------------------------------------------------------------
    println("hello1 is referentially equal to hello2: ${hello1 === hello2}")

    //-----------------------------------------------------------------------------
    // 3. Using one line of code, test whether hello1 and hello2 are structural equal
    //-----------------------------------------------------------------------------
    println("hello1 is structurally equal to hello2: ${hello1 == hello2}")

    //-----------------------------------------------------------------------------
    // 4. Declare a mutable variable of type Int and assign it the value of 2988
    //-----------------------------------------------------------------------------
    var number = 2988

    //-----------------------------------------------------------------------------
    // 5. Declare an immutable variable of type Any and assign it the String "The
    // Any type is the root of the Kotlin class hierarchy". Then, using a smart
    // cast, print uppercase string
    //-----------------------------------------------------------------------------
    val any: Any = "The Any type is the root of the Kotlin class hierarchy"
    if (any is String) {
        println(any.toUpperCase())
    }

    //-----------------------------------------------------------------------------
    // 6. Using one line of code, print out the following. Make sure your code is
    // nicely indented
    //    1
    //   1 1
    //  1 1 1
    // 1 1 1 1
    //-----------------------------------------------------------------------------
    println(
        """
        |   1
    |  11
    | 111
    |1111""".trimMargin()
    )

    println(
        """   1   1
                  1  11
                  1 111
                  11111""".trimMargin("1")
    )
```

#### Section 2
```kotlin
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
```