import kotlin.math.abs

fun Int.findNOD(other: Int): Int {

//    val result: Int

    if (other == 0 && this ==0) return 0
    if(other == 0) return abs(this)
    if (this == 0) return abs(other)


    var a = abs(this)
    var b = abs(other)


    while (b !=0) {
        val temp = b
        b = a % b
        a = temp
    }

    return a
}