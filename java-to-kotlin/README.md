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

### [[↑]](#toc) <a name='section_0'>Section 0: Introduction To Kotlin</a>

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
    
#### Development Environment
- Intellij
- Java 8    
    
### [[↑]](#toc) <a name='section_1'>Section 1: Basic differences between Kotlin and Java</a>
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
    
### [[↑]](#toc) <a name='section_2'>Section 2: Data Types and Null Reference Handling</a>

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

### [[↑]](#toc) <a name='section_3'>Section 3: OO and Kotlin: Classes, Functions, Inheritance</a>

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

### [[↑]](#toc) <a name='section_4'>Section 4: Loops, and the If, When and Try/Catch Expressions</a>

- The For Loop

- The If Expression

- The When Expression

- The Try/Catch Expression

### [[↑]](#toc) <a name='section_5'>Section 5: Lambda Expressions, Collections, and Generics</a>

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

### [[↑]](#toc) <a name='section_6'>Section 6: File IO</a>

- Reading Text Files

- Reading Binary Files

- Try with Resources

- Walking the File Tree

### [[↑]](#toc) <a name='section_7'>Section 7: Java Interoperability</a>

- Nullability when using Java from Kotlin

- Calling Java from Kotlin

- Calling Kotlin Functions from Java

- Annotations when calling Kotlin from Java

