fun main(args: Array<String>) {
    println(addition(2, 3))
    println(addition(5, 6, 7))
    println(addition(a=2.3, b=7.2))
    // Named Argument
    println(divi(2.5, 6.3))
}

// Overlaoding by NumberOfParameters
fun addition(a: Int, b: Int): Int {
    return a + b
}

fun addition(a: Int, b: Int, c: Int): Int {
    return a + b + c
}

// Overloading by Datatype
fun addition(a: Double, b: Double): Double {
    return a + b
}

// Named Argument Function
fun divi(a: Double, b: Double): Double {
    return a / b
}
