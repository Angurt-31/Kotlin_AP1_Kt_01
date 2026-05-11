fun main() {

    println("===Enter===")

    val input = inputSize()

    val listUsers = inputUserNameAge(input)

    val filterList = adultSelection(listUsers)

    outputAdultName(filterList)

}