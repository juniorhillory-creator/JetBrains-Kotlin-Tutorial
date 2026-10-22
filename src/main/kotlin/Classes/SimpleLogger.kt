//logger class
package Classes

import Interfaces.Logger

class SimpleLogger : Logger{
    override fun log(tag: String,any: Any){
        println("$tag : ${any.toString()}")
    }
}