import java.util.concurrent.Executors

//Threads,thread pools and executors

//thread
class CustomThread : Thread("CustomThread") {
    override fun run(){
        super.run()
        println(Thread.currentThread().name)
        println("CustomThread.run()")
    }
}

//customrunnable
class CustomRunnable: Runnable{
    override fun run(){
        println(Thread.currentThread().name)
        println("CustomRunnable.run")//output
    }
}

//single thread executor
val executor= Executors.newSingleThreadExecutor()
//fixed thread pools
val multiThreadExecutor=Executors.newFixedThreadPool(3)


fun main(){
    println(Thread.currentThread().name)
    //CustomThread().start() -->Run the Thread for CustomThread

    //Thread(CustomRunnable()).start() -->Thread for CustomRunnable

    //executor submit
    /*executor.submit { CustomRunnable() }*/

    //loop to submit multiple instances
    for (i in 0..10)
        multiThreadExecutor.submit(CustomRunnable())

}