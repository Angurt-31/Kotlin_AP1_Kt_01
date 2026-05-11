class Triangle(private val p1: Point, private val p2: Point, private val p3: Point){

    // считаем длинну сторон
    private fun Length(a: Point, b: Point): Double{
        val dx = b.x - a.x
        val dy = b.y - a.y
        return Math.sqrt(dx * dx + dy * dy)
    }

    val L1 = Length(p1, p2)
    val L2 = Length(p2, p3)
    val L3 = Length(p3, p1)

    //проверяем что треугольник
    fun isValid(): Boolean {
        // Если какая-то сторона БОЛЬШЕ ИЛИ РАВНА суммы двух других → не треугольник
        if (L1 >= L2 + L3 || L2 >= L1 + L3 || L3 >= L1 + L2) {
            return false
        }
        return true
    }

    // считаем периметр
    fun perimeter(): Double{
        val result = L1 + L2 + L3
        return result
    }

}