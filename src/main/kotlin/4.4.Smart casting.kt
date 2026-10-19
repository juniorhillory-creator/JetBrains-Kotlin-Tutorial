//Smart casting
/*Print one message if our variable is int and another if our variable is string*/

//Check type
fun checkType(input:Any?){

//    if(input is String?){
//        if (input == null) {
//            //No longer shows the error for null safe call
//            println("Input was a null String")
//        }
//        else{
//            println("Input is a String with length ${input.length}")
//        }
//        println("input is a String with length ${input.length}")
//    }
//    else{
//        println("input is a Int")
//    }
    //Lets do with when
    when(input){
        null->println("Input was null")
        is String->println("Input was string of length ${input.length}")
    }
}
fun main(){
    val aGenericVariable: Any = 5//cast Any

//check the type
    checkType(aGenericVariable)
    checkType("null")
}