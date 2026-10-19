//Arrays
fun main(){
    var ints=arrayOf(1,2,3,4,null)
    val nulls=arrayOfNulls<Int>(5)

    /*Specifing int type and passing 5 values*/
    val custom=Array(5){
        index->index //index for array
    }
    val sizeOfArray=ints.size
    val firstValue=ints.get(0)//Get a value
    ints.set(0,99)//Set value to array ints.set(index,value)
    ints[0]=99

    val primitiveInts=intArrayOf(1,2,3,4,5)
    val primitiveUShorts=ushortArrayOf(1u,2u,3u,4u,5u)

    for (i in 0 until ints.size){
        println(ints[i])
    }
    for (element in ints){
        println(element)
    }
    //Operate each element of the array forEach()
    ints.forEach{
        element->println(element)
    }
    //Call greetThings
    greetThings("Hey",
        arrayOf("Kotlin","Programming"))
    
    greetThings("hello","Kotlin","Programming","Linkedin")
}

//Print variable number
fun greetThings(greeting: String, vararg items:Any){
    for (item in items){
        println("$greeting, $item")
    }
}