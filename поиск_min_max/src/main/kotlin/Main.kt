import kotlin.system.exitProcess
import java.io.File

fun main(){

    println("=== Enter File Name (name.txt)===")


    val inputName = readFileName()
        if(inputName == null) {
            exitProcess(0)
    }

    val readNumbers = readFile(inputName)
    if (readNumbers == null){
        exitProcess(0)
    }

    val minmax = minMax(readNumbers)

    val  write = writeFile(minmax)



}
