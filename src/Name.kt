import java.util.*

//developed by paul juma
fun main() {
    val `in` = Scanner(System.`in`)
    println("please input your number")
    var number = `in`.nextInt()
    if (number % 2 == 0) {
        println("$number is even")
    } else {
        println("$number is odd")
    }
    main()
}
