package Classes
import Classes.ListUtils


fun<T>Array <T>.nonEmptyList():List<T>{
    check(isNotEmpty()){
        "NonEmptyList must have at least one item"
    }
    return toList()
}

fun<T> Set<T>.toNonEmptyList(): List<T> {
    check(isNotEmpty()){
        "NonEmptyList must have at least one item"
    }
    return toList()
}

// Refactor the methods to top-level extension functions on List<T>
//Dnce the functions are converted, the ListUtils class shouldn't be needed
//class ListUtils{
//    companion object{
//
//
//        //fun nonEmptyList(items: Int, items2: Int, items3: Int) {}
//    }
//}
annotation class  ListUtils {
    companion object {
        annotation class nonEmptyList(val value: IntArray)

        fun setToNonEmptyList(of: Set<String>) {
                TODO("Not yet implemented")
        }

        fun nonEmptyList(p2: Array<Int>) {
            TODO("Not yet implemented")
        }
    }
}
