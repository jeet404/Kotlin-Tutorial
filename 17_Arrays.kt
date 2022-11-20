fun main(args: Array<String>) {
    var arr = arrayOf<String>("Hello", "World", "Kotlin")
    var arrInt = arrayOf<Int>(1, 6, 7)

    // Set and Get Methods
    println(arr[2])
    arr.set(2, "Tony")
    println(arr[2])
    println(arrInt.get(2))
    println(arr.size)
}
