//evaluate expressions and add watches
/* A break point can suspend a line of application*/

import kotlin.random.Random

fun getRandomInt()=Random.nextInt()//Generate a random value

fun main(){
    for(i in 0 until 4){
        val random = getRandomInt()//call the random value generator
        val isEven = random.rem(2) == 1/*If run the code with the debugger attached,debugger stops at that point */
        when(isEven){
            true->print("$random is even")
            false->print("$random is not even")
        }
    }
}