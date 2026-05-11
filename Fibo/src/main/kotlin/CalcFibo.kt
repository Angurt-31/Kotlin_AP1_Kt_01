import com.sun.jdi.Value
import java.math.BigInteger

val memo = mutableMapOf<Int, BigInteger>()

fun calcFibo(number: Int): BigInteger {



    memo[number]?.let {value ->
        return value
    }

    if (number <= 1){
        memo[number] = number.toBigInteger()
        return number.toBigInteger()
    }

    val fibonacci: BigInteger = calcFibo(number - 1) + calcFibo(number - 2)
    memo[number] = fibonacci
    return fibonacci
}