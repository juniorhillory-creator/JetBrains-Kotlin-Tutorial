import Enum.Directions

//Enum classes

//think that We r going to model cardinal directions

fun main(){
    val direction: Directions = Enum.Directions.WEST //define directions variable
    println(direction.name)
    println(direction.ordinal)//index of the value

    //val parsedDirection=Enum.Directions.valueOf("kotlin")
    //println(direction.name)


    val apiValue= Enum.Directions.values()[2]
    println(apiValue.name)

    //colors
    val color = Enum.HighlightColor.BLUE
    println(color.value)
}