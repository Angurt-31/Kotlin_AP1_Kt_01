fun main(){

    println("==Enter==")

    val input = readNumbers()

    if(input != null){
        val sortList =  sortList(input)
        outputResult(sortList)
    }
}