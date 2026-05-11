import java.util.Locale
import java.util.Scanner

fun readNumbers(): MutableList<Double>? {

    val scanner = Scanner(System.`in`)
    scanner.useLocale(Locale.US)
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

    val numbers = mutableListOf<Double>()

    for (i in 0 until size) {
        while (true) {
            if (!scanner.hasNextDouble()) {
                println("Couldn't parse a number. Please, try again")
                scanner.next()
                continue
            }

            numbers.add(scanner.nextDouble())
            break
        }
    }

    return numbers
}
