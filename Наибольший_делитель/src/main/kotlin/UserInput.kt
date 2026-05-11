import java.util.Scanner

fun inputTwoNumbers(): Pair<Int, Int>{


    val scanner = Scanner(System.`in`)

    val twoNumbers = mutableListOf<Int>()

    while (twoNumbers.size < 2) {

        if (!scanner.hasNextInt()) {
            println("Couldn't parse a number. Please, try again")
            scanner.next()
            continue
        }

            twoNumbers.add(scanner.nextInt())

        }

    return Pair(twoNumbers[0], twoNumbers[1])
}

