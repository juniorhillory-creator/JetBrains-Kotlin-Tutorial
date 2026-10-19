//01_Kotlin_Essential_Training
/**
 * A Higher-Order Function that calculates and displays a result.
 *
 * What is a Higher-Order Function?
 * In Kotlin, functions are "first-class citizens" — they can be stored in variables,
 * passed as arguments to other functions, or returned from functions.
 *
 * @param value1 The first integer operand.
 * @param value2 The second integer operand.
 * @param calculator A function passed as a parameter (Function Type).
 *                   It must accept two `Int` parameters and return an `Int`: `(Int, Int) -> Int`.
 */
fun printCalculatedValue(value1: Int, value2: Int, calculator: (Int, Int) -> Int) {
    // 1. calculator(value1, value2) executes whichever lambda or function was passed in.
    // 2. String interpolation "${...}" evaluates the expression and inserts the result directly into the text.
    println("The value is: ${calculator(value1, value2)}")
}

fun main() {
    // Calling printCalculatedValue with an Addition Lambda:
    // A lambda is an anonymous function (a function without a name) defined with curly braces { }.
    // Syntax: { parameter1, parameter2 -> body_expression }
    printCalculatedValue(2, 2, { value1, value2 ->
        value1 + value2 // The last (and only) line of the lambda is implicitly returned
    })

    // Calling printCalculatedValue with a Subtraction Lambda:
    // Here we pass the same numbers (2, 2), but a different operation behavior.
    printCalculatedValue(2, 2, { value1, value2 ->
        value1 - value2
    })
    // Calling printCalculatedValue with a Multiplication Lambda:
    // Here we pass the same numbers (2, 2), but a different operation behavior.
    printCalculatedValue(2,2,{value1,value2->
        value1 * value2
    })
    //trailing lambda syntax, makes more readable
    printCalculatedValue(2,2){value1,value2->
        value1 / value2
    }
}