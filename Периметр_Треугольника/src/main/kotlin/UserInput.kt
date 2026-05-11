

fun readTrianglePoints(): Triple<Point, Point, Point> {

    val coordinates = mutableListOf<Double>()

    while(coordinates.size < 6) {  // проверяем размер списка, а не count
        try {
            val input = readln()
            val number = input.toDouble()
            coordinates.add(number)  // добавляем
            // если ошибка, size не увеличится, цикл повторится
        } catch (_: Exception) {
            println("Couldn't parse a number. Please, try again")
        }
    }

    val p1 = Point(coordinates[0], coordinates[1])
    val p2 = Point(coordinates[2], coordinates[3])
    val p3 = Point(coordinates[4], coordinates[5])

    return Triple(p1, p2, p3)

}
