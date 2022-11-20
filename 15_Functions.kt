fun main(args: Array<String>) {
    println(sum(10, 6))
    println(divi(7, 2))
    println(divi())
    println(disp("Jeet"))
}

fun sum(num1: Int, num2: Int): Int {
    var res = num1 + num2
    return res
}

// With Default Arguments
fun divi(num1: Int = 10, num2: Int = 2): Int {
    var res = num1 / num2
    return res
}

// Inline Function
fun disp(name: String): String = "My Name is $name"
