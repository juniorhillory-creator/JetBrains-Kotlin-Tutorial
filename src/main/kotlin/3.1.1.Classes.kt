package org.example

// 1. Parent Class: Marked 'open' so it can be inherited
open class Person(val age: Int, val firstName: String, val lastName: String) {

    // Prints the full name using string templates
    open fun printName() {
        println("$firstName $lastName")
    }
}

// 2. Child Class: Inherits from Classes.Person using the colon (:) syntax
class Student(
    age: Int,
    firstName: String,
    lastName: String
) : Person(age, firstName, lastName)

fun main() {
    // 3. Storing Classes.Student instances inside Classes.Person-typed reference variables
    val student: Person = Student(34, "Nate", "Ben")
    val person: Person = Student(34, "Max", "Nall")

    // Accessing a property (wrap in println to display it)
    println("Age: ${person.age}") // Prints: Age: 34

    // 4. Calling inherited methods
    student.printName() // Prints: Nate Ben
    person.printName()  // Prints: Max Nall
}