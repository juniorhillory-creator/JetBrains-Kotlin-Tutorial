package Sealed_classes

//'uiclass' sealed class
sealed class UIState {
    //loading state
    object Loading : UIState()

    //loaded state
    data class Loaded(
        val title:String,
        val subtitle:String
    ):UIState()

    //error
    class Error(val error:Throwable):UIState()

}