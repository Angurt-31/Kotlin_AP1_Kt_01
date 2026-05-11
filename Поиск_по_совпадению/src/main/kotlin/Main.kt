fun main(){

    println("==Enter==")

    val inputList = userInput()

    if (inputList != null){
        val solutionList = resultList(inputList)
        outputResList(solutionList)
    }

}