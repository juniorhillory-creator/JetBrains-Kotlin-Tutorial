package Sealed_classes

sealed class StringResult {
    data class Success(val value: String) : StringResult()
    data class Error(val error: Throwable): StringResult()
}