//01_Kotlin_Essential_Training
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    //immutable variables (val ourFirstVariable)
    //to store mutable variables
   var ourFirstVariable = true
    println(ourFirstVariable)

    ourFirstVariable = false
    println(ourFirstVariable)

    println(ourFirstVariable==true)
    println(ourFirstVariable==false)

    //numaric data types
    val aInt: Int = 0 //Int is 32 bit
    val anotherInt = 1

    val aByte: Byte = 0 //8 bits
    val aShort: Short = 0 //16Bits

    val aLong: Long = 0 //64 Bits
    val inferrendInt=10 //32Bit int
    val inferrendLong = 10000000 //Larger than 32bit
    val anotherLong = 10L //Should be treated as a long

    val unsignedInt: UInt = 0U
    val unsignedLong = 0UL

    val aFloat: Float = 0f //32Bit
    val aDouble: Double = 5.5 //64Bit

    println(5==4)
    println(10f>1)
    println(10.1<=5.2)

    println(10.1.toInt())
    println(10.9.toFloat())
 println(100_000_000.toByte())

 //Char and String data types
    val aChar: Char = 'a'
    val aNumaricChar = '1'
    val newLineChar = '\n'

    //val contactOption1= 'a'+'b'
    //val concatOption2='ab'

    val aString: String = "Hello Kotlin!"
    val escaped = "Hello \n World!"
 //raw string
 val raw ="""
    >>Some
       multiline
      text
    >>is going on here
  """.trimMargin(">>")
 println(raw)

 val concatString="Hello"+"Kotlin!"

 val concatNumber="The number"+10
 println(concatNumber)

 val aNumber=10
 //Operations inside the var call
 val concatTemplate="The number ${1+aNumber}"
 println(concatTemplate)

 //For ease of work
 val someString="Hello There!"
 println(someString.isEmpty())//Checks empty or not(T/F)
 println(someString.isNotEmpty())//Checks empty or not
 println(someString.isBlank())//Checks blank or not(not spaces)

 //Checks that the string contains "kotlin"
 val anotherString="Hello Kotlin There!"
 println(anotherString.contains("Kotlin"))
}