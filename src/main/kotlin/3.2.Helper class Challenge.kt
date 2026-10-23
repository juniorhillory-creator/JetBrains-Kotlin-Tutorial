import Classes.ListUtils
import Classes.nonEmptyList
import Classes.toNonEmptyList

// Refactor the methods to top-level extension functions on List<T>
//Dnce the functions are converted, the ListUtils class shouldn't be needed

fun main() {
    arrayOf(1,2,3).nonEmptyList()
    setOf("a","b","c").toNonEmptyList()

    val nonEmptyList = ListUtils.nonEmptyList(arrayOf(1, 2, 3))
    ListUtils.setToNonEmptyList(setOf("a","b","c"))
}

class ListUtils {
    companion object {
        fun nonEmptyList(arrayOf: Array<Int>) {
            TODO("Not yet implemented")
        }
    }

}

fun<T> nonEmptyList(vararg items: T, isNotEmpty: Unit.() -> Boolean):List<T>{
    check(items.isNotEmpty()){
        "NonEmptyList must have at least one item"
    }
    return items.toList()
}

fun <T> setToNonEmptyList(set:Set<T>):List<T>{
    check(set.isNotEmpty()){
        "NonEmptyList must have at least one items"
    }
    return set.toList()
}

fun nonEmptyList(items: Array<Int>) {
    TODO("Not yet implemented")
}

