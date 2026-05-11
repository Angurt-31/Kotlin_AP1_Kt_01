fun outputAdultName(name: List<String>){

    if (name.isEmpty()){
        return
    }else{
       val res = name.joinToString (separator = ", ")
        println(res)
    }
}