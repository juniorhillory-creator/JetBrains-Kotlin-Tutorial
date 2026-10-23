import kotlinx.coroutines.*
import kotlin.time.Duration.Companion.milliseconds

private suspend fun refreshTasks() {
    delay(3000.milliseconds)
    println("Refreshing tasks on ${Thread.currentThread().name}")
}
private suspend fun refreshReservations() {
    delay(3000.milliseconds)
    println("Refreshing reservations on ${Thread.currentThread().name}")
}
private fun refreshUser() {
    println("Refreshing user on ${Thread.currentThread().name}")
}
private fun updateUI() {
    println("Updating UI on ${Thread.currentThread().name}")
}

private fun cancelEverything(vararg jobs: Job) {
    jobs.forEach { it.cancel() }
}

fun main(): Unit = runBlocking {

    /*launch(Dispatchers.IO) {
         refreshTasks()
         refreshReservations()*/

    val job2=launch {
        val tasks = async { refreshTasks() }
        val reservations = async { refreshReservations() }

        awaitAll(tasks, reservations)


        withContext(this@runBlocking.coroutineContext) {
            updateUI()
        }
    }
    val job=launch {refreshUser() }

    cancelEverything(job,job2)
}