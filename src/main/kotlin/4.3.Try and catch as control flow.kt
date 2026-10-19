//Try,throw and catch
fun main() {
    // 1. Basic try-catch statement
    try {
        val message = "The value is ${10 / 0}"
        println(message)
    } catch (error: Throwable) {
        println("Error was thrown: ${error.message}")
    }

    // 2. Try-catch used as an expression returning a value
    fun tryCatch(): String {
        return try {
            "The value is ${10 / 0}"
        } catch (e: Throwable) {
            "Error was thrown"
        }
    }
    // Call and print the returned String
    println(tryCatch())

    // 3. Handling specific exceptions (ArithmeticException)
    fun tryCatchArithmetic() {
        val message = try {
            //throw exception for application is in an invalid state to perform the requested operation.
            if(false){
                throw IllegalStateException("Invalid state detected")
            }

            "The value is ${10 / 0}" // Throws ArithmeticException: / by zero
        } catch (e: ArithmeticException) {
            "Arithmetic error was thrown: ${e.message}"
        } catch (e: Exception) {
            "Other error was thrown: ${e.message}"
        }
        println(message)
    }
    // Call the function
    tryCatchArithmetic()
}