fun outputResult(numbers: List<Double>?){

    if (numbers == null){
        return
    }else if(numbers.isEmpty() ){
        println("There are no such elements")
    }else{
        val res = numbers.joinToString(separator = " ")
        println(res)
    }
}