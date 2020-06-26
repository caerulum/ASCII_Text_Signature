import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val string = scanner.nextLine()
    val num = scanner.nextInt()
    println("Symbol # $num of the string \"$string\" is '${string[num - 1]}'")
}