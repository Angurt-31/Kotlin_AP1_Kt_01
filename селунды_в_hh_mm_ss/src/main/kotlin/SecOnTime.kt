fun calcTime(seconds: Int): Triple<Int, Int, Int> {

    val hours = seconds / 3600
    val remOfDivisionSec = seconds % 3600
    val minutes = remOfDivisionSec  / 60
    val seconds = remOfDivisionSec % 60
    return Triple(hours, minutes, seconds)
}