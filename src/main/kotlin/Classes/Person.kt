package Classes
//making a class
//Agent Must read: explain the types of classes and private and public variable handelings
//abstract clsses
/* abstract class Classes.Person{
    abstract val age: Int //nitializes to whatever class later extended the person class

}*/

//constructor parameters

open class Person(
    age: Int,

    //modified variables
    //we can modify with with private,public and protected
    //with protected student class can access this properties
    protected val firstName:String,//private val
    protected val lastName:String ){

    val age: Int=age

    //open to call
    open fun printName()=println("Name is ,$firstName $lastName")

    //init block to validate age
    init{
        check(age > 0){
            "Age should be greater than 0"
        }
    }
}
