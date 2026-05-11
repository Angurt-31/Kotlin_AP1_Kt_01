fun userInput(): Int {
    while (true){
        try {
            val input = readln()
            val number = input.toInt()
            if(number < 0){
                println("Incorrect number")
                continue
            } else if (number >= 6658){
                println("Too large number")
                continue
            }else{
                return number
            }
        }catch ( e: NumberFormatException){
            println("Couldn't parse a number. Please, try again")
        }
    }
}