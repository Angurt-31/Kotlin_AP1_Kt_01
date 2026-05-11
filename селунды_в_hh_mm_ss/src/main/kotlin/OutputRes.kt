fun formatTime(time: Triple<Int, Int, Int>): String {
    val (hours, minutes, seconds) = time
    val formatHours = hours.toString().padStart(2, '0')
    val formatMinutes = minutes.toString().padStart(2, '0')
    val formatSeconds = seconds.toString().padStart(2, '0')

    return "$formatHours:$formatMinutes:$formatSeconds"
}