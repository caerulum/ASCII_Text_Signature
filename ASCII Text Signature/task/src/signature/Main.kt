package signature

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    val name = scanner.nextLine()
    val stringLength = name.length + 4
    repeat(stringLength) {
        print("*")
    }
    println()
    println("* $name *")
    repeat(stringLength) {
        print("*")
    }
}
