fun main(args: Array<String>) {

    // With Simple Range
    for (i in 3..10) {
        println(i)
    }

    println("-----")

    // With changed increament
    for (i in 1..10 step 2) {
        println(i)
    }

    // With Decreament
    for (i in 5 downTo 1) {
        println(i)
    }

    // With String Templating
    var number = 5
    for (index in 1..10) {
        println("$number x $index = ${number*index}")
    }
}
