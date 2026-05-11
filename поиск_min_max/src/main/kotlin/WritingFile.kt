import java.io.File

fun writeFile(resMinMax: List<Double>){

    val resToString = resMinMax.joinToString(" ")

    val writeFile = File("result.txt")
    writeFile.writeText(resToString)

    println("Saving min and max values in file")

}