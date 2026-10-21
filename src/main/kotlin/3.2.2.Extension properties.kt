//extension properties and functions


val Int.isEven: Boolean
    get()=this.mod(2)==0

fun main(){
   // millisForHours(4)
   // millisForHours(10)

    4.millisForHours()
    10.millisForHours()

    /*** Converts the string into a regular expression [Regex] with the default options.
     */
    "[abc]+".toRegex()

    println(8.isEven)
    println(7.isEven)

    5.log()
    "sampe string".log()
    listOf(1,2,3).log()

}