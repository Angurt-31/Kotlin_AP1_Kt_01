
fun readSecondes(): Int {

    while (true){
        try {
            val input = readln()
            val secondes = input.toInt()
            if (secondes < 0) {
                println("Incorrect time")
                continue
            }else{
                return secondes
            }
        } catch (e: NumberFormatException){
            println("Couldn't parse a number. Please, try again")
        }
    }
}
