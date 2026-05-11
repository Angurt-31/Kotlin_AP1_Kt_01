fun outputList(resultList: List<String>?){


    if (resultList == null) {
        return
    }

    for (i in 0 until resultList.size){
        if (i != 0 ) {
            print(',' + resultList[i])
        }else{
            print(resultList[i])
        }
    }
}