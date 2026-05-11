fun minMax(listNumbers: List<Double>): List<Double>{


    var min = listNumbers[0]
    var max = listNumbers[0]


    for(i in 1 until listNumbers.size){
        val current = listNumbers[i]
        if(current < min){
            min = listNumbers[i]
        }
        if(current > max){
                max = listNumbers[i]
            }
    }


    val resMinMax = mutableListOf<Double>()
    resMinMax.add(min)
    resMinMax.add(max)


    return resMinMax
}