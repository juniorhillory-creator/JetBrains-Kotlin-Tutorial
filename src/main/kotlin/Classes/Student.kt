package Classes

//student class
//making student constructor
class Student(//parameters
    age: Int,
    firstName: String,
    lastName: String
) //pass to person constructor
 : Person(age,firstName,lastName){
    //override the behavior
    override fun printName() {
        println("Classes.Student:$firstName $lastName")
    }
}