//01_Kotlin_Essential_Training
fun printFormattedName
            (fname: String,
                       lname: String,
                       formatter:(String,String)->String) {
                println(" ${formatter(fname,lname)}")
}

var Formatter1:(String,String)->String={fname,lname->
    "$fname $lname"
}
var Formatter2:(String, String)-> String={fname,lname->
        "First name is $fname and the Last name is $lname"
}
fun main(){
    printFormattedName("Tom","Cruse",Formatter1)
    printFormattedName("Tom","Cruse",Formatter2)

    printFormattedName("Tom","Cruse"){fname,lname->
        "$lname $fname"
    }
}