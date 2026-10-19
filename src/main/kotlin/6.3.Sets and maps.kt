//Sets and maps
fun main() {
    //val languages:Set<String> = setOf("kotlin","java","C++","kotlin") Set of non nullable strings
    val languages = mutableSetOf("kotlin", "java", "C++", "kotlin")//Mutables
    //duplicated values are not be taken
    for (language in languages) {//for read language in languages
        println(language)
    }
    languages.size
    println(languages.contains("kotlin"))//Checks true or not

    languages.add("javascript")
    languages.remove("javascript")
//mapping fun
    val testScores = mutableMapOf(Pair(123, 91.2), Pair(456, 84.5), 789 to 79.1)//Mutable map
    println(testScores[123])

    for (record in testScores) {//read records in testScores
        println("Score for user ${record.key} was ${record.value}")

    }
    for((id,score) in testScores) {//read kay and value as the is and score
        println("Score for user ${id} was ${score}")
    }

    testScores.containsKey(123)
    testScores.containsValue(100.0)

    testScores.keys.forEach{println(it)}

    testScores[111]=97.8 //Assign values to specific key using Mutable mapping
    testScores.put(222,72.1)
    testScores.remove(222)
    testScores.replace(111,98.7)
}
