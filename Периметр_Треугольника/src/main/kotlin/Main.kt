fun main(){

    println("==Inter_coordinates==")
    val (p1, p2, p3) = readTrianglePoints()


    val triangle = Triangle(p1, p2, p3)


    if(triangle.isValid()){
        val perimeter = triangle.perimeter()
        println("Perimetr: ${"%.3f".format(perimeter)}") //результат
    }else{
        println("It's not a triangle") // если не треугольник
    }
}



