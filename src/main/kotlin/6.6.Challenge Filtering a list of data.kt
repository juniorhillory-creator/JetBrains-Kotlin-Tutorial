//Challenge Filtering a list of data
val testScores=mapOf(
    "123abc" to 88.1,
    "124xyz" to 88.9,
    "125xyz" to 88.6,
    "126xyz" to 88.4,
    "127xyz" to 88.3,
)

fun main(){
    testScores.toList()
        .sortedBy { pair -> pair.second }//sort by test score
        .map{pair -> pair.first}//map to student id
        .take(3)//take 3 lowest values for the sorted list
        .forEach { println(it) }
}