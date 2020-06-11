# Java to Kotlin

### What is Kotlin
- Runs anywhere the JVM can run
- Statically typed
    - type of every expression is determined at compile time
    - compiler will know the type of expression and data before running
- Its object oriented
- Functional Programming

### Guiding Principle
- Conciseness
    - Little code we need to write as oppose to java
- Safety 
    - Difficult to generate NPE
- Pragmatic
    - Not research language
    - A solution can be solved in many ways using kotlin
    - you can be as concise or more verbose
- Interoperability
    - Was designed to be interoperable with java
    
### Basic differences between Kotlin and Java

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
    - [Source](src/main/kotlin/com/rohan/kotlin/Decalarations.kt)
    
- Type Aliases
    - Aliases of existing data type
    - Always declared at the top
    - Eg. StringBuilder in Kotlin refers to java.lang.StringBuilder
    - [Source](src/main/kotlin/com/rohan/kotlin/TypeAliases.kt)
    
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
    
- Equality
    - In Java, "==" checks references. But in Kotlin "==" checks both structural equality and references
    - To check referential equality we use "==="
    - "!="
    = "!=="
    - [Source](src/main/kotlin/com/rohan/kotlin/Equality.kt)