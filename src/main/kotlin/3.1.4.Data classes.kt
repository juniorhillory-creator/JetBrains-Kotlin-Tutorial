import Data_classes.Tasks

//Data classes
fun main(){
    //task variables
    val task1 = Tasks("a1", "Add analytics")//constructor1
    val task2 = Tasks("a1", "Add analytics")//constructor2

    println(task1.name)
    println(task2.name)

    val task2Copy=task2.copy(id="c3")//copy task2

    val(id,name)=task1

    if(task1.name==task2.name){
        println("Data_classes.Tasks are the same")
    }else{
        println("Data_classes.Tasks are not the same")
    }
}