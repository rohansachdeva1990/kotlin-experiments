# Java to Kotlin

### Section 0: Introduction To Kotlin

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
    - Was designed to be interoperable with java
    
### Section 1: Basic differences between Kotlin and Java

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
        - There is no "throw" keyword 
        - Both checked and unchecked comes under the same hood
        - All exceptions are unchecked
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
        - It equivalent is "is"
        - not is =. !is
    - Casting using "as"
    - Smart casting is only maintained if you don't change the type in current context.
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
    
### Section 2: Data Types and Null Reference Handling

- The Builtin Datatypes in Kotlin

- Arrays in Kotlin

- Null References in Kotlin

- Arrays and Null References


### Section 3: OO and Kotlin: Classes, Functions, Inheritance

- Kotlin's Access Modifiers

- Declaring Classes and Using Constructors in Kotlin

- Properties and Backing Fields in Kotlin

- Constants and Data Classes

- Kotlin Function Basics

- Extension Functions

- Inline Functions

- Inheritance in Kotlin

- Interfaces in Kotlin

- Singletons in Kotlin

- Companion Objects in Kotlin

- Enums in Kotlin

- Imports in Kotlin

- The Internal Access Modifier

### Section 4: Loops, and the If, When and Try/Catch Expressions

- The For Loop

- The If Expression

- The When Expression

- The Try/Catch Expression

### Section 5: Lambda Expressions, Collections, and Generics

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

### Section 6: File I/O

- Reading Text Files

- Reading Binary Files

- Try with Resources

- Walking the File Tree

### Section 7: Java Interoperability

- Nullability when using Java from Kotlin

- Calling Java from Kotlin

- Calling Kotlin Functions from Java

- Annotations when calling Kotlin from Java

