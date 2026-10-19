//While loops
fun main(){
    var counter=0

    while (counter<=5){//condition
        counter++//increment
        println("Less than ${counter}")//output
        if (counter==3)/*if condition*/break//break
    }
    //Do while loop
    var count=0
    do{//do
        println(count)//output
        count+=1//increment
    }while(count<=3)//condition true or not
}