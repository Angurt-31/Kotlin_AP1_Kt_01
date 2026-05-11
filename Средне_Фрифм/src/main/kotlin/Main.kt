fun main(){

    println("===Enter===")

    val list = readNumbers()

    if (list != null) {

        val res = arMeanNega(list)
        if (res != null) {
            println(res)
        } else {
            println("There are no negative elements")
        }
    }


}