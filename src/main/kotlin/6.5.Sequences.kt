fun main() {
    // -------------------------------------------------------------
    // 1. Read-Only Collections (Inspection Only)
    // -------------------------------------------------------------

    // Elements cannot be added or removed through these references:
    val readOnlyList: List<Int> = listOf(1, 2, 3)
    val readOnlySet: Set<Int> = setOf(1, 2, 3)
    val readOnlyMap: Map<Int, String> = mapOf(1 to "a", 2 to "b")

    println(readOnlyList[0])            // Reads index 0 -> Prints: 1
    println(readOnlySet.contains(2))    // Checks presence -> Prints: true
    println(readOnlyMap[1])             // Looks up key 1  -> Prints: a

    // readOnlyList.add(4)              // COMPILE ERROR: Unresolved reference 'add'
    // readOnlyMap[3] = "c"             // COMPILE ERROR: No set method providing array access


    // -------------------------------------------------------------
    // 2. Mutable Collections (Read & Modify)
    // -------------------------------------------------------------

    val mutableList: MutableList<Int> = mutableListOf(1, 2, 3)
    val mutableSet: MutableSet<Int> = mutableSetOf(1, 2, 3)
    val mutableMap: MutableMap<Int, String> = mutableMapOf(1 to "a", 2 to "b")

    // Adding and mutating data:
    mutableList.add(4)                  // Appends 4 to the end
    mutableList[0] = 99                 // Updates index 0 from 1 to 99

    mutableSet.add(4)                   // Adds 4
    mutableSet.add(2)                   // Ignored: 2 already exists

    mutableMap[3] = "c"                 // Adds key 3 with value "c"
    mutableMap[1] = "z"                 // Overwrites key 1 value from "a" to "z"

    // Print resulting modified collections:
    println(mutableList)                // Prints: [99, 2, 3, 4]
    println(mutableSet)                 // Prints: [1, 2, 3, 4]
    println(mutableMap)                 // Prints: {1=z, 2=b, 3=c}
}