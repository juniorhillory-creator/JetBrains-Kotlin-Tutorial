//Stepping through the code
/* A break point can suspend a line of application*/

import kotlin.random.Random
fun main(){
    for(i in 0 until 4){
        val random = Random.nextInt()
        val isEven = random.rem(2) == 1
        when(isEven){
            true->print("$random is even")
            false->print("$random is not even")
        }
    }
}