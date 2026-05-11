fun arMeanNega(numbers: MutableList<Int>?): Int?{

    var sum = 0
    var count = 0

    if(numbers == null) {
        return null
    }else{

        for (i in 0 until numbers.size) {
            if (numbers[i] < 0) {
                sum += numbers[i]
                count++
            }
        }

        if (count > 0) {
            val result = sum / count
            return result
        } else {
            return null
        }
    }
}