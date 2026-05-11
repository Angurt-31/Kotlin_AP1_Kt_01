import java.io.File

fun readFileName(): String?{
    while (true){

        val input = readln().trim()

        if (input.isEmpty()){
            println("Nothing is entered, please try again")
            continue
        }

        if (!File(input).exists()){
            println("Input error. File isn't exist")
            return null
        }

        return input
    }
}