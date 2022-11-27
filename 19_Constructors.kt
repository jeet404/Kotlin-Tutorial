fun main(args: Array<String>) {
    var p1 = person("Tony", 38, 12478546)
    println(p1.personName)
    println(p1.personAge)
    println(p1.personMobile)
    var c1 = car("Innova",7,"Disel")
    println(c1.seats)
    var c2 = car("Alto")
}

class person(var name: String, var age: Int, var mobile: Int) {
    var personName: String = "$name Created"
    var personAge: Int = age
    var personMobile: Int = mobile
}

class car(val name: String, val seats: Int, fuelType: String) {
    init {
        println("Initilization Done!")
    }

    constructor(nameParam: String) : this(nameParam, seats: 5, fuelParam:"Pretol")
}
