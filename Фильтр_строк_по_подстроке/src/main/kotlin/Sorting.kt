fun selectList(inputStrings: MutableList<String>?, substring: String): List<String>{

    val resultList = mutableListOf<String>()

    if (inputStrings == null){
        return emptyList()
    }



    for (i in 0 until inputStrings.size) {
        if (inputStrings[i].contains(substring)) {
            resultList.add(inputStrings[i])
        }
    }
return resultList
}