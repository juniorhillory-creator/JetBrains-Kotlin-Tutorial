//Working with Coroutines
import kotlinx.coroutines.DelicateCoroutinesApi
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

//import kotlinx.coroutines.*
@OptIn(DelicateCoroutinesApi::class)
fun main(): Unit=runBlocking{
    launch {println("Hello coroutines")}

    //Thread.sleep(1000)//Block main thread from completing for 1 second
    //To prevent completing our program early
}
