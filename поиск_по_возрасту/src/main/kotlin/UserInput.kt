import java.util.Scanner

fun inputSize(): Int{

    val scanner = Scanner(System.`in`)
    var size: Int


    while(true) {
        if (!scanner.hasNextInt()){
            println("Couldn't parse a number. Please, try again")
            scanner.next()
            continue
        }

        size = scanner.nextInt()


        if (size <= 0){
            println("Input error. Size <= 0 Please, try again")
            continue
        }
        return size
    }
}




fun inputUserNameAge(size: Int): List<User> {

    val userNameAge = mutableListOf<User>()
    val scanner = Scanner(System.`in`)


    for (i in 1..size) {

        val name = scanner.nextLine()
        if (name.isEmpty()){
            println("The name cannot be empty. Please, try again")
            continue
        }


        var age: Int? = null
        while (age == null) {

            val ageInput = scanner.nextLine()
            val input: Int? = ageInput.toIntOrNull()
            if (input == null) {
                println("Couldn't parse a number. Please, try again")
                continue // повторить ввод возраста для этого же пользователя
            }

            if (input <= 0) {
                println("Incorrect input. Age <= 0")
//               // input = -1
                break
            }

            age = input

        }
       if (age != null){
           userNameAge.add(User(name, age))
       }
    }

    return userNameAge
}