import Sealed_classes.StringResult
import kotlin.random.Random

//Creating a result type using a sealed class
//Create a sealed class
//// Sealed_classes.StringResult should have possible states
//Success
//Error
//// Sealed_classes.StringResult.Success should have a public String property
//// Sealed_classes.StringResult.Error should have a public Throwable property

fun main(){
    when(val result=getString()){
        is StringResult.Error -> println("There was an error")
        is StringResult.Success -> println(result.value)
    }
}

fun getString(): StringResult {
    return try{
        StringResult.Success(getRandomString())
    }catch(error:java.lang.IllegalStateException){
        StringResult.Error(error)
    }
}

fun getRandomString():String{
    val rand=Random.nextInt(10)
    return if(rand>5){
        throw IllegalStateException()
    } else{
        rand.toString()
    }

}