import java.util.*

fun main() {
    val `in` = Scanner(System.`in`)
    println("please input your number")
    var number = `in`.nextInt()
    if (number % 2 == 0) {
        println("the number is even")
    } else {
        println("the number is odd")
    }
    main()
}