//If and When
fun main(){
  //Assigning variable
    var x=3
  //If condition 1
  if (x>5){
      println("Not greater than 5")
  }
  //If it is not satisfied
  else if (x<2){
      println("Greater than 2")
  }
  //Else
  else{
      println("Greater than 5")
  }

  //When statement
  var y=3

  when{
      y>5 -> println("The value is greater than 5")//statement with arrow operator
      y>4 -> println("The value is equal to 4")
      else -> {
          println("Not greater")
      }
  }
    when(y){
        0,1 -> println("The value is zero")//checks the value is 0 or 1
        2->println("The value is equal to 2")//is the value 2
        3->println("The value is equal to 3")
        in 4..Int.MAX_VALUE ->println("The value is between 4 and 6")//If variable in the range of 4 and maximum
    }
}