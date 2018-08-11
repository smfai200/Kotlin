// Hello World Program



fun main(args : Array<String>) {
    val User1 = UserProfileConstructorOverloading(Name="Faizan",Age=25,PhoneNumber = "0345123123213")
    print(User1)
    val User2 = UserProfileConstructorOverloading(Name="Salman", Age = 22,Email = "asdas@gmail.com")
    print(User2)
}


//fun main(args : Array<String>) {
//    val User1 = UserProfile(Name = "Salman",Age = 20,PhoneNumber = "03333392390",Email = "sallu@gmail.com")
//    var User2 = UserProfile(Name = "Ibtihaj",Age = 20,PhoneNumber = "031292232132",Email = "ibtii@gmail.com")
//    println(User1)
//    println(User2)
//}

//fun main(args : Array<String>) {
//    val carstatus = CarEngineStatus()
//    var carstatus1 = CarEngineStatus()
//
//    carstatus.CarEngineStarted()
//    carstatus1.CarEngineStopped()
//
//    println(carstatus.CarStatus())
//    println(carstatus1.CarStatus())
//}

fun calc():Float{
    var a:Int
    var b:Int
    var result:Float = 0f
    println("Enter First Number: ")
    a = readLine()!!.toInt()
    println("Enter Second Number: ")
    b = readLine()!!.toInt()
    println("Enter Operation to Perform (+,-,*,/)")
    var operation = readLine().toString()
//    println(a)
//    println(b)
//    println(operation)
    when(operation){
        "+" -> {
//            print("add")
            result = (a+b).toFloat()
        }
        "-" -> {
//            print ("sub")
            result = (a-b).toFloat()
        }
        "*" -> {
//            print("mul")
            result = (a*b).toFloat()
        }
        "/" -> {
//            print("div")
            result = (a/b).toFloat()
        }
    }
    return result
}