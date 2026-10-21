//internal variable
internal val hourInMillis = 60 * 60 * 1000

//internal fun
internal fun millisForHours(hours: Int) = hours * hourInMillis

//For extention properties
@JvmName("millisForHoursExt")
internal fun Int.millisForHours() = this * hourInMillis
