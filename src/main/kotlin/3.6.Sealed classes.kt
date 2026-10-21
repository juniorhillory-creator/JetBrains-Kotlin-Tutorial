import Sealed_classes.UIState

//sealed class

//Render the state
fun render(state: UIState)=when(state){//when as an expression
    //branches
    is UIState.Error -> println("Error")
    is UIState.Loaded -> println("Loaded:${state.title}")
    UIState.Loading -> println("Loading")
}
fun main(){
    var state: UIState = UIState.Loading
    render(state)

    state= UIState.Loaded("kotlin","Is cool")
    render(state)

    state= UIState.Error(IllegalStateException())
    render(state)

}