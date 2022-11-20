fun main(args: Array<String>) {
    var st = student(50, "Jeet", 19)
    st.getDetails()
}

class student(val rollno: Int, val name: String, var age: Int) { // Properties
    fun getDetails() { // Method
        println("Roll No is $rollno")
        println("Name is $name")
        println("Age No is $age")
    }
}
