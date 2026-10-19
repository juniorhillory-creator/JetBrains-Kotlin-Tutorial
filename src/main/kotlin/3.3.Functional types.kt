//01_Kotlin_Essential_Training
//Functional types
//Functions may be passed to, or returned from,other functions.
//Functions may be stored as variables
//How to define variables with functional types
//initialize the function vaiable
var greetingFunction: (String)-> String={ thingToGreet->
    "Hello $thingToGreet"
}
//store functions as variable values
fun main(){
    //paasing argument values
    println(greetingFunction("World"))
    println(greetingFunction("Kotlin"))
    greetingFunction={thingToGreet->
        "Hello $thingToGreet!"
    }
    println(greetingFunction.invoke("Kotlin Programming"))//call with invoke
}