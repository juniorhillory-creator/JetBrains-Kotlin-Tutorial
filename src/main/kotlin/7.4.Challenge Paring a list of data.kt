import java.io.File
import kotlin.io.path.writeLines

//Parsing a list of data from a file
//Find the highest test scores from a file
//Scores are located in scores.txt
//Prompt the user to enter the name of the input file
//Read each line of the specified file.
//Sort the scores,locate the three highest,and write them to an output file.

fun main(){
  print("Enter the name of the file containing scores: ")
    val inputFilename=readLine()

    if (inputFilename.isNullOrEmpty()){
        println("Not a valid filename")
        return
    }

    val inputFile = File(inputFilename)
    if(!inputFile.isFile)return

    val rawScores = inputFile.readLines()

    val persedScores=rawScores.map { line ->
        val elements = line.split(":")
        elements[0] to elements[1]
    }
    val finalScores=persedScores
        .sortedByDescending {it.second}
        .take(3)

    val outputPath=File("sorted_output.txt").toPath()
    val outputScores=finalScores.map{
        "${it.first}: ${it.second}"
    }
    outputPath.writeLines(outputScores)
}