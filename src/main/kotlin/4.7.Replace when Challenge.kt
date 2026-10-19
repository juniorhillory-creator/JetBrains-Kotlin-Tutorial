
//Rewrite above using when
fun getOutput(input:Any?): String= when(input){
    is Number -> {
        if(input !is Int){
            "Input was an Int"
        }else{
            "Input was a non Int Number"
        }
    }
    is String -> "Input was a String ${input.length}"
    null->"Input was null"
    else->"Input didn't match target inputs"

}
fun main() {
    println(getOutput(null))
    println(getOutput(4))
    println(getOutput(3.2))
    println(getOutput("Hello Kotlin"))
}