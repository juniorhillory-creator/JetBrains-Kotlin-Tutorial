//companion object
class SearchController {
    private var query:String = ""

    companion object{

        private const val MAX_RESULTS_TO_SHOW=  20

        init{
            MAX_RESULTS_TO_SHOW
        }

        fun create(initialQuery: String):SearchController{
            val controller=SearchController()
            controller.query=initialQuery
            return controller
        }
    }
}