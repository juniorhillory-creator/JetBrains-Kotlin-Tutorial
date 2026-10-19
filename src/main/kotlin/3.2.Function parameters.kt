//01_Kotlin_Essential_Training
//Parameters
private fun printGreetings()=println("Hello Kotlin")
fun main(){
    //name the parameter and type. Default parameters
    fun getGreetings(greeting: String,
                     thingToGreet:String,
                     location:String ="World")="$greeting $thingToGreet $location"//$thingToGreet,greeting substitute with value
    //argument to parameter
    println(getGreetings("Hello","Kotlin"))//Pass the parameters
    //The default parameter is assigned above
}