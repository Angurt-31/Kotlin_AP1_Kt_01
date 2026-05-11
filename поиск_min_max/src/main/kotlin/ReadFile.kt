import java.io.File

fun readFile(input: String): List<Double>? {

    val file = File(input)
    val listFile = file.readText()
    val tokens = listFile.split(Regex("\\s+"))

    if (tokens.isEmpty()) return null

    val size = tokens[0].toIntOrNull()
    if(size == null || size <= 0){
        println("Input error. Size <= 0")
        return null
    }

    val listNumbers = mutableListOf<Double>()

    var i = 1

    while (i < tokens.size && listNumbers.size < size){

        val number = tokens[i].toDoubleOrNull()

        if (number != null)
            listNumbers.add(number)

        i++
    }


    if (listNumbers.size < size){
        println("Input error. Insufficient number of elements")
        return null
    }


    println("$size\n${listNumbers.joinToString(" ")}")

    return listNumbers
}
