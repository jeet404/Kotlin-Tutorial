fun main(args: Array<String>) {
    var age = 19

    // Method-1
    if (age < 18 && age > 60) {
        println("You Can't Drive")
    } else if (age > 18 && age < 60) {
        println("You Can Drive")
    } else {
        println("Not Found")
    }

    // Method-2
    age = 16
    var result =
            if (age < 18) {
                "You Can't Drive"
            } else if (age > 18 && age < 60) {
                "You Can Drive"
            } else {
                "Not Found"
            }
    println(result)
}
