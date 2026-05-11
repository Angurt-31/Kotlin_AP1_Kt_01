fun sortList(numbers: MutableList<Double>): MutableList<Double>{

    val n = numbers.size

    for (i in 0 until  n - 1){
        var minIndex = i

        for(j in i + 1 until n){
            if(numbers[j] < numbers[minIndex]){
                minIndex = j
            }
            }
        if(minIndex != i){
            var temple = numbers[i]
            numbers[i] = numbers[minIndex]
            numbers[minIndex] = temple
        }
    }
    return numbers
}