// Working with collections in Kotlin
fun main(){
    // Collection types: demonstrating read-only vs mutable collections
    val readOnlyList= listOf(1,2,3)// Read-only list: ordered collection with indexed access; cannot add, remove, or modify item
    val readOnlySet= setOf(1,2,3)// Read-only set: collection of unique elements; automatically discards duplicates and cannot be modified
    val readOnlyMap=mapOf(1 to "a",2 to "b")// Read-only map: stores key-value pairs using the 'to' infix function; keys are unique and entries cannot be modified

    val mutableList= mutableListOf(1,2,3)// Mutable list: ordered collection allowing additions (add), removals (remove/removeAt), and updates
    val mutableSet= mutableSetOf(1,2,3)// Mutable set: unique-element collection that allows adding and removing items
    val mutableMap=mutableMapOf(1 to "a",2 to "b")// Mutable map: key-value collection that supports adding new pairs, updating values, and removing keys

    // Accesses total element count of the collection
    mutableList.size
    readOnlyList.size

    // Checks if the collection contains no elements (returns false here)
    mutableSet.isEmpty()
    // Checks if the collection contains at least one element (returns true here)
    readOnlyList.isNotEmpty()

    // Iterating through a set using a standard for-in loop
    for(element in readOnlySet){
        println(element)
    }
    // Iterating over map entries with a two-parameter lambda (key, value)
    mutableMap.forEach{key,value->println(value)}

    // Retrieves the first element of the collection; throws NoSuchElementException if empty
    readOnlyList.first()
    mutableSet.first()

    // Returns a new list containing the first n elements (or fewer if collection is smaller)
    mutableList.take(3)
    readOnlySet.take(2)

    // Filters map entries keeping only those whose key satisfies the predicate (< 2)
    mutableMap.filter { entry -> entry.key<2 }
    // Filters list elements keeping only numbers greater than 1
    readOnlyList.filter{value->value>1}

    //Transform one collection of data into another collection
    val languages = mapOf(
        "kotlin" to 5,
        "java" to 3,
        "javax" to 4,
        "C++" to 2,
        "Python" to 6
    )
    // Chaining collection processing operations:
    // 1. filter: retains entries with a rating/value >= 4 ("kotlin", "javax", "Python")
    // 2. map: transforms entries into a list containing only their keys (String)
    // 3. sorted: sorts the resulting strings in natural alphabetical order
    // 4. forEach: prints each sorted language name on a new line
    languages.filter{it.value >= 4}
        .map{it.key}
        .sorted()
        .forEach{println(it)}

}