import java.util.Scanner

fun readNumbers(): MutableList<Int>? {

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

    val numbers = mutableListOf<Int>()

    for (i in 0 until size) {
        while (true) {
            if (!scanner.hasNextInt()) {
                println("Couldn't parse a number. Please, try again")
                scanner.next()
                continue
            }

            numbers.add(scanner.nextInt())
            break
        }
    }

    return numbers
}