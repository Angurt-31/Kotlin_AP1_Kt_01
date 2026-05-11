import java.util.Scanner

fun userInput(): MutableList<String>? {
    val scanner = Scanner(System.`in`)
    var size: Int

    while (true) {
        if (!scanner.hasNextInt()) {
            println("Couldn't parse a number. Please, try again")
            scanner.next()
            continue
        }

        size = scanner.nextInt()

        if (size <= 0) {
            println("Input error. Size <= 0")
            return null
        }
        break
    }

    val probel = scanner.nextLine()


    val inputStrings = mutableListOf<String>()

        for (i in 0 until size) {
            inputStrings.add(scanner.nextLine())

        }

    return inputStrings
}

fun readSubtring(): String{
    val scanner = Scanner(System.`in`)

    val substring = scanner.nextLine()

    return substring

}