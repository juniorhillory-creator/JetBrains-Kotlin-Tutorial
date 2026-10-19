//Statements vs expressions
fun getMessage(input:Int):String{
    return if (input >3){
        "Greater than 3"
    }
    else{
        "Not greater than 3" }
}

//fun getMessageWithWhen(input:Int)=when(input){
//    3->"vale is 3"
//    else -> "value is not 3"
//}
fun getMessageWithWhen(input:Int)=when(input){
    3->"vale is 3"
    else -> {"Not an 3"}
}
fun main(){
    var someVariable=0
//    val message =if(someVariable>3){
//        "The value was greater than 3"
//    } else{
//        "The value was less than 3"
//    }
//    println(message)
    val message = when(someVariable){
        3-> "The value is 3"
        else -> "The value is not 3"
    }
}