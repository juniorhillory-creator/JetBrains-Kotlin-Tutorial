//Read and write to files
//import file directory
import java.io.File
import kotlin.io.path.writeLines

fun main(){
    //assigning file to a var
    var scoresFile=File("scores.txt")

    scoresFile.forEachLine { line->println(line) }
//read line by line from scores.txt
    val sortedLines=scoresFile.readLines().sorted()
//call a new file called sorted_putput.txt and write to sorted_output.txt
    val outputFile= File("sorted_output.txt").toPath()
    outputFile.writeLines(sortedLines)
}