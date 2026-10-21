import Interfaces.NetworkInfoProvider
import Object_classes.NetworkConfig

//object classes
fun main(){
    println(NetworkConfig.baseUrl)
    println(NetworkConfig.getNetworkDetails())

    //object expression
    val provider: NetworkInfoProvider =object: NetworkInfoProvider {
        override fun getNetworkDetails(): String {
            //return Object_classes.NetworkConfig.getNetworkDetails() replace with TODO to fix the error
            TODO("Not yet implemented")
        }
    }
    provider.getNetworkDetails()
}