import Enum.Directions
import Enum.HighlightColor
import kotlin.Enum.Companion

//Enum classes

//think that We r going to model cardinal directions

//private val Companion.Directions:

fun main() {
    // Reference enum constants directly by their class name
    val direction: Directions = Directions.WEST
    println(direction.name)    // Prints: WEST
    println(direction.ordinal) // Prints: 3 (0-based index)

    // valueOf matches the exact name of the constant
    val parsedDirection = Directions.valueOf("WEST")
    println(parsedDirection.name)

    // In modern Kotlin (1.9+), use .entries instead of .values()
    val apiValue = Directions.entries[2] // or Directions.values()[2]
    println(apiValue.name)               // Prints: EAST

    // Enum with custom property
    val color = HighlightColor.BLUE
    println(color.value)                 // Prints: #0000FF
}