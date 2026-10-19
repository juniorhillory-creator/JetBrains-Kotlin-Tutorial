//Command-line arguments
fun main(vararg args:String){
    if(args.isEmpty()){
        println("Usage: please provide some arguments!")
        return
    }
    println("First arg is ${args[0]}")

    for (arg in args)println(arg)

}