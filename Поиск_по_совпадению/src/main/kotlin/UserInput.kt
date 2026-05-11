import java.util.Scanner

fun userInput(): MutableList<Int>? {

    val scanner = Scanner(System.`in`)
    var sizeList = 0

    while(true) {

        if (!scanner.hasNextInt()) {
            println("Couldn't parse a number. Please, try again")
            scanner.next()
            continue
        }

        sizeList = scanner.nextInt()

        if (sizeList <= 0) {
            println("Input error. Size <= 0")
            return null
        }

        break
    }


    val numbers = mutableListOf<Int>()

    var i = 0
    while (i < sizeList) {
        while (true) {
            if (!scanner.hasNextInt()) {
                println("Couldn't parse a number. Please, try again")
                scanner.next()
                continue
            }
            numbers.add(scanner.nextInt())
            break
        }
        i++
    }

return  numbers
}