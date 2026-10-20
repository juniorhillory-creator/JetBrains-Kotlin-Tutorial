package org.example

// Base contract: requires a property and provides a default method
interface StringProvider {
    val placeholder: String // Must be overridden by implementing classes

    fun getString(id: Int): String = id.toString() // Optional override (has default)
}

// Child interface: inherits StringProvider and adds another default method
interface ResourceProvider : StringProvider {
    fun getDimention(id: Int): Long = id.toLong() // Optional override (has default)
}

// Fulfills ResourceProvider (and transitively StringProvider)
class DefaultResourceProvider : ResourceProvider {
    override val placeholder: String = "<placeholder>" // Mandatory override

    // getString() and getDimention() use their interface defaults automatically
}

fun main() {
    var someVariable: Any? = null
    // Checks type at runtime; safely evaluates to false for null
    if (someVariable is StringProvider) {
        println("The variable was a StringProvider")
    }

    val stringProvider = DefaultResourceProvider()
    println(stringProvider.getString(5)) // Uses default method -> Prints: 5
    println(stringProvider.placeholder)  // Uses overridden property -> Prints: <placeholder>
}
