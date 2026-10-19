//01_Kotlin_Essential_Training
fun main(){
    //Nullable types
    //how to represent absence of data in Kotlin?

//nulls
    var aNullableString: String? = null//Add '?' to make non-nullable into nullable
    //Assign value to null variable (aNullableString = "Kotlin")

    //NullPointerException
    //!! Asterts the value is not null before accessing it.Esier but leads to crashes
    //ex:- println(aNullableString!!.length)
    //Add '?' is Null safe call to prevent throwing NullPointerException
    println(aNullableString?.length)
    //Elvis operator for evaluate the expression and return some default value
    println(aNullableString?.length ?:"the value was null")


}