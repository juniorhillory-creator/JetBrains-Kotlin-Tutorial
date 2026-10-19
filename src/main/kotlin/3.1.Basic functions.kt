//01_Kotlin_Essential_Training
//creating functions
fun printGreeting(){
    println("Hello World")//inbuilt print
}

//Return a valuable thing from function
//Defigning return type for a function and return a value from the body
fun getGreeting(): String{
    return "Hello Kotlin"
}

//Single expression function, Publically available function
fun printGreeting2()=println("Hello Kotlin print")

//main body
fun main() { // fun main(): Unit A non meaningfull return type
    printGreeting()//Calling printGreeting function
    println(getGreeting())//Calling to return by getGreeting
    printGreeting2()
    //Single expression function inide main
    fun getGreeting2() = "Hello Kotlin get"
    println(getGreeting2())
}
