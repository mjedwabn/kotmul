fun sayHi(number: Int): String {
    val msg = CommonHello().sayHi(number)
    println("sayHi -> $msg")
    return msg
}

fun hi1410(): String {
    val msg = sayHi(1410)
    println("hi1410 -> $msg")
    return msg
}

fun main(args: Array<String>) {
    println("main -> ${sayHi(42)}")
}
