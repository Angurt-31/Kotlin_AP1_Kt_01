fun outputResList(resaltList: List<Int>?){

    if (resaltList == null){
        return
    }else if (resaltList.isEmpty()){
        println("There are no such elements")
    }else{
        val res = resaltList.joinToString(separator = " ")
        println(res)
    }
}