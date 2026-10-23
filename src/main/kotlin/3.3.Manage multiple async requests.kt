import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

//Simulated API calls
private suspend fun loadItemsFromDB():List<String>{
    delay(2000.milliseconds)
    return listOf("Kotlin","java","C#")
}

//private suspend fun fetchTasks(): List<String>{
//    delay(5000.milliseconds)
//    return listOf()
//}

private suspend fun loadItemsFromNetwork(): List<String> {
    delay(5000.milliseconds)
    return listOf("Rust","Python","C")
}

fun main(): Unit =runBlocking {
    val startTime=System.currentTimeMillis()

    //parallelize execution using async
    val db=async { loadItemsFromDB() }
    val network=async{loadItemsFromNetwork()}

    //wait for the results
    val dbItems=db.await()
    val networkItems=network.await()

    //combine into unified list
    val combinedList=dbItems+networkItems
    combinedList.forEach {languages->println(languages)}
}

