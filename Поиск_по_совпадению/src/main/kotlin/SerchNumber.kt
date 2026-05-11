import kotlin.math.abs

fun serchFirstLast(number: Int): Boolean {

    var temp = abs(number)
    val last = (abs(number) % 10)

    while (temp >= 10) {
        temp = temp / 10
    }

    if (last == temp)
        return true
    else {
        return false
    }
}

    fun resultList(input: List<Int>?): List<Int>?{
        if (input == null) return null

        val result = mutableListOf<Int>()
        var i = 0

        while (i < input.size){
            val number = input[i]
            if (serchFirstLast(number)){
                result.add(number)
            }
            i++
        }
        return result
    }
