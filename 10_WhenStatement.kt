fun main(args: Array<String>) {
    val fruit = "Apple"

    // Method-1
    when (fruit) {
        "Apple" -> println("You Choose Apple")
        "Banana" -> println("You Choose Banana")
        "Graps" -> println("You Choose Graps")
        "Gvava" -> println("You Choose Gvava")
        else -> println("Not Found!")
    }

    // Method-2
    var result =
            when (fruit) {
                "Apple" -> "You Choose Apple"
                "Banana" -> "You Choose Banana"
                "Graps" -> "You Choose Graps"
                "Gvava" -> "You Choose Gvava"
                else -> "Not Found!"
            }
    println(result)
}
