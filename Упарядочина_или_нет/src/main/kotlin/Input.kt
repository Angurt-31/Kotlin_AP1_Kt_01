import java.util.Scanner

fun readNumber() {

    val scanner = Scanner(System.`in`)

    var prevNumber = 0
    var index = -1
    var hasInput = false

    while (scanner.hasNext()) {

        if (!scanner.hasNextInt()) {
            break
        }

        val currentNumber = scanner.nextInt()

        hasInput = true
        index++

        if (index == 0) {
            prevNumber = currentNumber
            continue
        }

        if (currentNumber <= prevNumber) {
            println(
                "The sequence is not ordered from the ordinal number of the number $index"
            )
            return
        }

        prevNumber = currentNumber
    }

    if (!hasInput) {
        println("Input error")
    } else {
        println("The sequence is ordered in ascending order")
    }
}
