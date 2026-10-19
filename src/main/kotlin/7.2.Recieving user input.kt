//Recieving user inputs

import java.io.File

fun main(){
    //input
    print("Ener a filename: ")
    //read the input
    val filename = readLine() ?:""
    println("You entered: $filename")

    val isValidFile=File(filename).isFile

    //checks if the file exists in the root
    if (isValidFile) {
        println("It is a valid file")
    }else{
        println("It is not a valid file")
    }
}