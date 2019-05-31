import java.lang.Exception

fun main () {
    try {
        println("Enter Ackermann(m,n)")
        println(ackermann(readLine()!!.toInt(), readLine()?.toInt() ?: 1))
    } catch (e: Exception) {
        e.printStackTrace()
    }

}


fun ackermann(m: Int, n: Int): Int {
   return when {
        m == 0 -> 2*n
        m >= 1 && n == 0 -> 0
        m >= 1 && n == 1 -> 2
        else -> ackermann(m - 1, ackermann(m, n - 1))
    }
}