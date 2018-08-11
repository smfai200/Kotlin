abstract class AbstractClass(name: String) {

    init {
        println("My name is $name.")
    }

    fun displayCNIC(cnic: String) {
        println("My CNIC is $cnic.")
    }

    abstract fun displayJob(description: String)
}

class Teacher(name: String): AbstractClass(name) {

    override fun displayJob(description: String) {
        println(description)
    }
}

fun main(args: Array<String>) {
    val obj = Teacher("Syed Faizan")
    obj.displayJob("I'm a Student :D ")
    obj.displayCNIC("213123123123123213123")
}