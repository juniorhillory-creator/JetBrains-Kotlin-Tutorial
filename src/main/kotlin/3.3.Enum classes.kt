//Enum classes

//think that We r going to model cardinal directions

fun main(){
    val direction:Directions=Directions.WEST //define directions variable
    println(direction.name)
    println(direction.ordinal)//index of the value

    //val parsedDirection=Directions.valueOf("kotlin")
    //println(direction.name)


    val apiValue=Directions.values()[2]
    println(apiValue.name)

    //colors
    val color = HighlightColor.BLUE
    println(color.value)
}