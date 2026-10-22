import Classes.ApplicationLogger
import Classes.SimpleLogger
import Classes.ViewModel

//Delegates
fun main(){
//    val appLogger= ApplicationLogger(SimpleLogger())
//    appLogger.log("example",appLogger)
    val viewModel= ViewModel()
    viewModel.search("Kotlin")
    viewModel.search("code")

}