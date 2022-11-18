fun main(args: Array<String>) {
    var num = 10
    var result = num in 1..15
    println(result)
    num = 15
    result = num in 1 until 15
    println(result)
}
