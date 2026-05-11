fun main(){

    println("===Enter seconds===")

    val seconds = readSecondes()

    val timeComponents = calcTime(seconds)

    val formateTime = formatTime(timeComponents)

    println(formateTime)
}