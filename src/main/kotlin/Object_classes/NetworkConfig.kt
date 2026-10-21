package Object_classes

import Interfaces.NetworkInfoProvider

//object classes
object NetworkConfig : NetworkInfoProvider {
    val baseUrl="http://localhost:8080"
    val userAgent="Demo-app"

    //interface body
    override fun getNetworkDetails(): String {
        return "$baseUrl-$userAgent"
    }
}